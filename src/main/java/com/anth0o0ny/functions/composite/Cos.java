package com.anth0o0ny.functions.composite;

import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.functions.basic.Sin;
import com.anth0o0ny.general.util.Parser;

public class Cos extends AbstractFunction {

    private Sin sin;

    public Cos() {}

    public Cos(Sin sin) {
        this.sin = sin;
    }

    public Cos(Sin sin, String funcName) {
        super(new Parser(funcName), funcName);
        this.sin = sin;
    }

    @Override
    public Double calculate(double value) {
        double temp = value % (2 * Math.PI);

        if (value < 0) {
            temp += 2 * Math.PI;
        }

        if (temp > Math.PI / 2 && temp < (Math.PI + Math.PI / 2)) {
            return -Math.sqrt(1 - Math.pow(sin.calculate(value), 2));
        } else {
            return Math.sqrt(1 - Math.pow(sin.calculate(value), 2));
        }
    }
}
