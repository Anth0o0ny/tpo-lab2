package com.anth0o0ny.functions;


import com.anth0o0ny.functions.basic.*;
import com.anth0o0ny.functions.composite.*;
import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.general.util.Parser;

public class EquationSystem extends AbstractFunction {

    private final Sin sin = new Sin();
    private final Cos cos = new Cos(sin);
    private final Csc csc = new Csc(sin);
    private final Sec sec = new Sec(cos);
    private final Cot cot = new Cot(sin, cos);
    private final Tan tan = new Tan(sin, cos);
    private final Ln ln = new Ln();
    private final Log log2 = new Log(ln, 2);
    private final Log log3 = new Log(ln, 3);
    private final Log log5 = new Log(ln, 5);

    public static final double EPSILON = 10;

    public EquationSystem() {}

    public EquationSystem(String funcName) {
        super(new Parser(funcName), funcName);
    }

    @Override
    public Double calculate(double x) {
        if (x <= 0) {
            // Вычисление числителя
            double numeratorPart1 = Math.pow(cot.calculate(x), 3);
            double numeratorPart2 = Math.pow(numeratorPart1, 3);
            double numeratorPart3 = numeratorPart2 - sin.calculate(x);
            double numeratorPart4 = Math.pow(numeratorPart3, 2);
            double numeratorPart5 = csc.calculate(x) - (cos.calculate(x) * csc.calculate(x));
            double numeratorPart6 = numeratorPart4 * numeratorPart5;
            double numeratorPart7 = sec.calculate(x) - csc.calculate(x);
            double numeratorPart8 = numeratorPart6 / numeratorPart7;
            double numeratorPart9 = cot.calculate(x) - Math.pow(tan.calculate(x), 3);
            double numeratorPart10 = numeratorPart8 * numeratorPart9;
            double numeratorPart11 = Math.pow(cos.calculate(x), 3);
            double numeratorPart12 = numeratorPart10 * numeratorPart11;
            double numeratorPart13 = csc.calculate(x) - ((cot.calculate(x) - csc.calculate(x)) / Math.pow(csc.calculate(x), 2));
            double numeratorPart14 = numeratorPart13 / cot.calculate(x);
            double numeratorPart15 = cot.calculate(x) / tan.calculate(x);
            double numeratorPart16 = numeratorPart14 * numeratorPart15;
            double numeratorPartLittleNumir = numeratorPart12 + numeratorPart16;
            double numeratorPart17 = Math.pow(Math.pow(cos.calculate(x), 2), 3);
            double numeratorPart18 = cot.calculate(x) * sec.calculate(x);
            double numeratorPart19 = numeratorPart17 / numeratorPart18;
            double numeratorPart20 = numeratorPartLittleNumir / numeratorPart19;
            double numeratorPart21 = tan.calculate(x);
            double numeratorPart22 = numeratorPart20 / numeratorPart21;
            double numeratorPart23 = numeratorPart22 * tan.calculate(x);
            double numeratorPart24 = sin.calculate(x);
            double numeratorPart25 = numeratorPart23 - numeratorPart24;
            double numeratorPart26 = Math.pow(numeratorPart25, 2);
            double numeratorPart27 = numeratorPart26 * numeratorPart26 * numeratorPart26;

            // Вычисление знаменателя
            double denominatorPart1 = Math.pow(cot.calculate(x), 3);
            double denominatorPart2 = Math.pow(denominatorPart1, 3);
            double denominatorPart3 = denominatorPart2 - sin.calculate(x);
            double denominatorPart4 = Math.pow(denominatorPart3, 2);
            double denominatorPart5 = csc.calculate(x) - (cos.calculate(x) * csc.calculate(x));
            double denominatorPart6 = denominatorPart4 * denominatorPart5;
            double denominatorPart7 = sec.calculate(x) - csc.calculate(x);
            double denominatorPart8 = denominatorPart6 / denominatorPart7;
            double denominatorPart9 = cot.calculate(x) - Math.pow(tan.calculate(x), 3);
            double denominatorPart10 = denominatorPart8 * denominatorPart9;
            double denominatorPart11 = Math.pow(cos.calculate(x), 3);
            double denominatorPart12 = denominatorPart10 * denominatorPart11;
            double denominatorPart13 = csc.calculate(x) - ((cot.calculate(x) - csc.calculate(x)) / Math.pow(csc.calculate(x), 2));
            double denominatorPart14 = denominatorPart13 / cot.calculate(x);
            double denominatorPart15 = cot.calculate(x) / tan.calculate(x);
            double denominatorPart16 = denominatorPart14 * denominatorPart15;
            double denominatorPart17 = Math.pow(Math.pow(cos.calculate(x), 2), 3);
            double denominatorPart18 = cot.calculate(x) * sec.calculate(x);
            double denominatorPart19 = denominatorPart17 / denominatorPart18;
            double denominatorPart20 = denominatorPart16 / denominatorPart19;
            double denominatorPart21 = tan.calculate(x);
            double denominatorPart22 = denominatorPart20 / denominatorPart21;
            double denominatorPart23 = denominatorPart22 * tan.calculate(x);
            double denominatorPart24 = sin.calculate(x);
            double denominatorPart25 = denominatorPart23 - denominatorPart24;
            double denominatorPart26 = Math.pow(denominatorPart25, 2);
            double denominatorPart27 = denominatorPart26 * denominatorPart26 * denominatorPart26;

            return numeratorPart27 / denominatorPart27;
        } else {
            return Math.pow((((((ln.calculate(x) * log3.calculate(x)) / log3.calculate(x)) - (log2.calculate(x) - log5.calculate(x))) + log3.calculate(x))), 2);
        }
    }


}
