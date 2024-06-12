package com.anth0o0ny.functions.composite;


import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.functions.basic.Sin;
import com.anth0o0ny.general.util.Parser;

public class Csc extends AbstractFunction {

    private Sin sin;

    public Csc() {}

    public Csc(Sin sin) {
        this.sin = sin;
    }

    public Csc(Sin sin, String funcName) {
        super(new Parser(funcName), funcName);
        this.sin = sin;
    }

    @Override
    public Double calculate(double value) {
        return (1 / sin.calculate(value));
    }

}
