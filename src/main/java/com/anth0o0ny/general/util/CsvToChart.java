package com.anth0o0ny.general.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class CsvToChart {
    public static void main(String[] args) {
        String directoryPath = "src/main/java/com/anth0o0ny/output/";  // Укажите путь к папке с CSV-файлами
        File folder = new File(directoryPath);
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().endsWith(".csv")) {
                    try {
                        createChart(file);
                    } catch (IOException e) {
                        System.err.println("Error processing file: " + file.getName());
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("The specified directory does not contain any files.");
        }
    }

    private static void createChart(File csvFile) throws IOException {
        FileReader reader = new FileReader(csvFile);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader);

        // Map to store header names after trimming
        Map<String, String> headerMap = new HashMap<>();
        CSVRecord headerRecord = records.iterator().next();
        for (String header : headerRecord.toMap().keySet()) {
            headerMap.put(header.trim(), header);
        }

        XYSeries series = new XYSeries("Data");
        for (CSVRecord record : records) {
            double x = Double.parseDouble(record.get(headerMap.get("x")));
            double y = Double.parseDouble(record.get(headerMap.get("y")));
            series.add(x, y);
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createScatterPlot(
                csvFile.getName(),
                "X",
                "Y",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        File imageFile = new File(csvFile.getParent(), csvFile.getName().replace(".csv", ".png"));
        ChartUtils.saveChartAsPNG(imageFile, chart, 800, 600);
        System.out.println("Chart saved as: " + imageFile.getAbsolutePath());
    }
}
