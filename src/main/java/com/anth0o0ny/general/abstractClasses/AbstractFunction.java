package com.anth0o0ny.general.abstractClasses;


import com.anth0o0ny.general.Interfaces.BasicFunction;
import com.anth0o0ny.general.util.Parser;


public abstract class AbstractFunction implements BasicFunction {

    public static final double EPSILON = 0.0001;

    public static final int ACCURACY = 100;

    public Parser parser;

    public String funcName;

    public AbstractFunction() {}

    public AbstractFunction(Parser parser, String funcName) {
        this.parser = parser;
        this.funcName = funcName;
    }

    @Override
    public Double calculateFactorial(int acc) {
        Double value = Double.valueOf(1);
        for (int i = 2; i <= acc; i++) {
            value = Double.valueOf(value * i);
        }
        return value;
    }

    @Override
    public double[] calculateAll(double[] x) {
        double[] results = new double[x.length];

        for (int i = 0; i < x.length; i++) {
            results[i] = this.calculate(x[i]);
        }

        return results;
    }

}
