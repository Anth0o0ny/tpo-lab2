package com.anth0o0ny.functions.basic;

import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.general.util.Parser;

public class Ln extends AbstractFunction {

    public Ln() {}

    public Ln(String funcName) {
        super(new Parser(funcName), funcName);
    }

    @Override
    public Double calculate(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Logarathm argument an't be less then zero");
        }

        double res = 0;

        for (int i = 1; i <= ACCURACY; i+=2) {
            res += Math.pow((1 - x) / (1 + x), i) / i;
        }

        return -2 * res;
    }

}

