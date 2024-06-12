package com.anth0o0ny.functions.composite;

import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.general.util.Parser;


public class Sec extends AbstractFunction {

    private Cos cos;

    public Sec() {}

    public Sec(Cos cos) {
        this.cos = cos;
    }

    public Sec(Cos cos, String funcName) {
        super(new Parser(funcName), funcName);
        this.cos = cos;
    }

    @Override
    public Double calculate(double value) {
        return (1/ cos.calculate(value));
    }

}
