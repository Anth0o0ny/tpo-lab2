package com.anth0o0ny.functions.composite;

import com.anth0o0ny.functions.basic.Ln;
import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.general.util.Parser;

public class Log extends AbstractFunction{

    private Integer BASE;

    private Ln ln;

    public Log() {}

    public Log(Ln ln, Integer base) {
        this.ln = ln;
        this.BASE = base;
    }

    public Log(Ln ln, Integer base, String funcName) {
        super(new Parser(funcName), funcName);
        this.ln = ln;
        this.BASE = base;
    }

    @Override
    public Double calculate(double value) {
        return (ln.calculate(value) / ln.calculate(BASE));
    }

}
