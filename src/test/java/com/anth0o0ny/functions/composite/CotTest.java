package com.anth0o0ny.functions.composite;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Map;

import com.anth0o0ny.functions.basic.Sin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.anth0o0ny.general.abstractClasses.AbstractFunction;
import com.anth0o0ny.functions.ArgumentProvider;
import com.anth0o0ny.functions.basic.Sin;
import com.anth0o0ny.general.util.TestsHolder;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class CotTest {

    @Mock
    private Sin mockSinus = new Sin();
    @Mock
    private Cos mockCosine = new Cos(null);
    @Spy
    private Cot mockCot;

    @BeforeEach
    public void init() {
        mockCot = new Cot(mockSinus, mockCosine);
        Map<Double, Double> sinStubs = ArgumentProvider.getStubs("Sin");
        for (Map.Entry<Double, Double> dot : sinStubs.entrySet()) {
            when(mockSinus.calculate(dot.getKey())).thenReturn(dot.getValue());
        }
        Map<Double, Double> cosStubs = ArgumentProvider.getStubs("Cos");
        for (Map.Entry<Double, Double> dot : cosStubs.entrySet()) {
            when(mockCosine.calculate(dot.getKey())).thenReturn(dot.getValue());
        }
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(mockCot.calculate(seriesValue), funcValue, AbstractFunction.EPSILON);
    }

}

