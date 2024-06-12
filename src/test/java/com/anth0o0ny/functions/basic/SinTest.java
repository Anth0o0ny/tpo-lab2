package com.anth0o0ny.functions.basic;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.functions.ArgumentProvider;

public class SinTest {

    private final Sin sin = new Sin();

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(sin.calculate(seriesValue), funcValue, AbstractFunction.EPSILON);
    }

}

