package com.anth0o0ny.general.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestsHolder {

    private static final Map<Double, Double> sinTestValue = new TreeMap<Double, Double>() {{
        put(-3.1415926535, 0.0);
        put(-2.5, -0.5984721441);
        put(-1.57079, -1.0);
        put(-0.5, -0.4794255386);
        put(0.0, 0.0);
        put(0.5, 0.4794255386);
        put(1.57079, 1.0);
        put(2.5, 0.5984721441);
        put(3.1415926535, 0.0);
    }};

    private static final Map<Double, Double> cosTestValue = new TreeMap<Double, Double>() {{
        put(-3.1415926535, -1.0);
        put(-2.5, -0.8011436155);
        put(-1.57079, 0.0);
        put(-0.5, 0.8775825618);
        put(0.0, 1.0);
        put(0.5, 0.8775825618);
        put(1.57079, 0.0);
        put(2.5, -0.8011436155);
        put(3.1415926535, -1.0);
    }};

    private static final Map<Double, Double> tanTestValue = new TreeMap<Double, Double>() {{
        put(-1.555, -63.3005911);
        put(-0.5, -0.546302);
        put(0.0, 0.0);
        put(0.5, 0.546302);
        put(1.555, 63.3005911);
    }};

    private static final Map<Double, Double> cotTestValue = new TreeMap<Double, Double>() {{
        put(-1.57079, 0.0);
        put(-0.5, -1.8304877215399975);
        put(0.5, 1.8304877215399975);
        put(1.57079, 0.0);
    }};

    private static final Map<Double, Double> secTestValue = new TreeMap<Double, Double>() {{
        put(-1.15, 2.448);
        put(0.0, 1.0);
        put(1.15, 2.448);
        put(-4.29, -2.439);
        put(-3.1415926535, -1.0);
        put(-2.0, -2.403);
    }};

    private static final Map<Double, Double> cscTestValue = new TreeMap<Double, Double>() {{
        put(1.57079, 1.0);
        put(0.5, 2.0858296429517744);
        put(-0.5, -2.0858296429517744);
        put(-1.57079, -1.0);
    }};

    private static final Map<Double, Double> lnTestValue = new TreeMap<Double, Double>() {{
        put(0.25, -1.3862943611198912);
        put(1.0, 0.0);
        put(2.0, 0.693147);
        put(5.0, 1.60944);
        put(10.0, 2.30259);
    }};

    private static final Map<Double, Double> log2TestValue = new TreeMap<Double, Double>() {{
        put(0.25, -2.000000520986012);
        put(1.0, 0.0);
        put(2.0, 1.0);
        put(5.0, 2.3219);
        put(10.0, 3.32193);
    }};

    private static final Map<Double, Double> log5TestValue = new TreeMap<Double, Double>() {{
        put(0.25, -0.8613519989063844);
        put(1.0, 0.0);
        put(2.0, 0.4307);
        put(5.0, 1.0);
        put(10.0, 1.43068);
    }};

    private static final Map<Double, Double> log3TestValue = new TreeMap<Double, Double>() {{
        put(1.0, 0.0);
        put(2.0, 0.30103);
        put(5.0, 0.69897);
        put(10.0, 1.0);
    }};

    private static final Map<Double, Double> equationTestValue = new TreeMap<Double, Double>() {{
        put(1.355, 0.1094);
        put(1.0, 0.0);
        put(0.818, 0.0479);


        put(-2.3073, -1.1929);
        put(-2.3056, 0.18055);
        put(-2.3056, 0.0);
        put(-2.3088, 0.0);

        put(-5.55, 0.0);
        put(-5.553, 0.011479);
        put(-5.5552, 0.0000005);
        put(-5.549, 0.0000577);
        put(-5.548, 0.0385);


        put(-0.7397, 1.0296E14);
        put(-0.7438, 1.0163E14);
        put(-0.7476, 1.0163E14);

        put(-3.907, 1.7413E14);
        put(-3.908, 1.7382E14);
        put(-3.909, 1.7411E14);

        put(-1.1081, 2.1923E20);
        put(-1.1052, 2.1997E20);
        put(-1.1116, 2.2023E20);

        put(-4.274, 1.6011E21);
        put(-4.255, 1.8059E21);
        put(-4.294, 1.8108E21);
        put(-4.405, 3.3394E22);

        put(-5.09, 8.1249E22);
        put(-5.068, 1.3223E23);
        put(-5.103, 1.0655E23);

        put(-1.959, 5.8072E25);
        put(-1.9568, 5.8351E25);
        put(-1.9606, 5.8271E25);
    }};

    public static final Map<String, Map<Double, Double>> testValues = new HashMap<String, Map<Double, Double>>() {{
        put("Sin", sinTestValue);
        put("Cos", cosTestValue);
        put("Tan", tanTestValue);
        put("Cot", cotTestValue);
        put("Sec", secTestValue);
        put("Csc", cscTestValue);
        put("Ln", lnTestValue);
        put("Log2", log2TestValue);
        put("Log3", log3TestValue);
        put("Log5", log5TestValue);
        put("EquationSystem", equationTestValue);
    }};
}
