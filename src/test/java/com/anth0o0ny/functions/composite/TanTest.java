package com.anth0o0ny.functions.composite;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.anth0o0ny.functions.basic.Sin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.mockito.Mock;
import org.mockito.Spy;

import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.functions.ArgumentProvider;

public class TanTest {

    @Spy
    private Tan tan;
    @Mock
    private Sin mockSin = new Sin();
    @Mock
    private Cos mockCos = new Cos(mockSin);

    @BeforeEach
    public void init() {
        this.tan = new Tan(mockSin, mockCos);
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(tan.calculate(seriesValue), funcValue, AbstractFunction.EPSILON);
    }

}

