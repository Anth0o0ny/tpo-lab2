package com.anth0o0ny.functions.basic;


import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.general.util.Parser;

public class Sin extends AbstractFunction {

    public Sin() {}

    public Sin(String funcName) {
        super(new Parser(funcName), funcName);
    }

    @Override
    public Double calculate(double x) {
        double res = 0;

        for (int i = 0; i <= ACCURACY; i++) {
            res += (
                    (
                            Math.pow(-1, i) * Math.pow(x, 2 * i + 1)
                    ) / (
                            calculateFactorial(2 * i + 1)
                    )
            );
        }

        return res;
    }

}