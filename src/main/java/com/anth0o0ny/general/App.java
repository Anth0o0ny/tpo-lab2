package com.anth0o0ny.general;

import java.util.Map;

import com.anth0o0ny.functions.EquationSystem;
import com.anth0o0ny.functions.basic.Sin;
import com.anth0o0ny.functions.composite.*;
import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.functions.basic.Ln;
import com.anth0o0ny.functions.basic.Sin;

import com.anth0o0ny.general.util.TestsHolder;


public class App {

    private static final Sin innerSinus = new Sin();
    private static final Cos innerCosine = new Cos(innerSinus);

    private static final AbstractFunction[] functions = new AbstractFunction[] {
            new Sin("Sin"),
            new Cos(innerSinus, "Cos"),
            new Tan(innerSinus, innerCosine, "Tan"),
            new Cot(innerSinus, innerCosine, "Cot"),
            new Sec(innerCosine, "Sec"),
            new Csc(innerSinus, "Csc"),
            new Ln("Ln"),
            new Log(new Ln(), 2, "Log2"),
            new Log(new Ln(), 3, "Log3"),
            new Log(new Ln(), 5, "Log5"),
            new EquationSystem("EquationSystem")
    };

    public static void main( String[] args ) {
        for (AbstractFunction func: functions) {
            Map<Double, Double> testsValue = TestsHolder.testValues.get(func.funcName);

            double[] xs = new double[testsValue.entrySet().size()];
            double[] ys = new double[testsValue.entrySet().size()];

            for (int i = 0; i < testsValue.entrySet().size(); i++) {
                double x = (double) testsValue.keySet().toArray()[i];
                double result = func.calculate(x);

                xs[i] = x;
                ys[i] = result;
            }

            func.parser.write(xs, ys);
        }
    }
}
