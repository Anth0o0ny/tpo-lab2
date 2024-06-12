package com.anth0o0ny.functions.composite;


import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.functions.basic.Sin;
import com.anth0o0ny.general.util.Parser;

public class Cot extends AbstractFunction {

    private Sin sin;
    private Cos cos;

    public Cot() {}

    public Cot(Sin sin, Cos cos) {
        this.sin = sin;
        this.cos = cos;
    }

    public Cot(Sin sin, Cos cos, String funcName) {
        super(new Parser(funcName), funcName);
        this.sin = sin;
        this.cos = cos;
    }

    @Override
    public Double calculate(double value) {
        return (cos.calculate(value) / sin.calculate(value));
    }

}

