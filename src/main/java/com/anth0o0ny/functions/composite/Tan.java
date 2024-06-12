package com.anth0o0ny.functions.composite;


import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.functions.basic.Sin;
import com.anth0o0ny.general.util.Parser;

public class Tan extends AbstractFunction {

    private Sin sin;
    private Cos cos;

    public Tan(Sin sin, Cos cos) {
        this.sin = sin;
        this.cos = cos;
    }

    public Tan(Sin sin, Cos cos, String funcName) {
        super(new Parser(funcName), funcName);
        this.sin = sin;
        this.cos = cos;
    }

    @Override
    public Double calculate(double value) {
        return (sin.calculate(value)/ cos.calculate(value));
    }

}
