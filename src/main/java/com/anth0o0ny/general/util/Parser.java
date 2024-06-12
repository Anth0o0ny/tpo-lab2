package com.anth0o0ny.general.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Parser {

    private final String path = "src/main/java/com/anth0o0ny/output/";
    private File file;

    public Parser(String filename) {
        file = new File(path + filename + ".csv");
    }

    private void writeHeaders(FileWriter writer) throws IOException {
        writer.write(new String("x, y"));
        writer.append('\n');
    }

    public void write(double[] x, double[] y) {
        try {
            file.createNewFile();

            FileWriter writer = new FileWriter(file, false);

            this.writeHeaders(writer);

            for (int i = 0; i < x.length; i++) {
                writer.write(new String(x[i] + ", " + y[i]));
                writer.append('\n');
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}

