package com.anth0o0ny.functions.composite;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Map;

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

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class SecTest {

    @Spy
    private Sec sec;
    @Mock
    private Cos mockCos = new Cos();

    @BeforeEach
    public void init() {
        this.sec = new Sec(mockCos);
        Map<Double, Double> stubs = ArgumentProvider.getStubs("Cos");
        for (Map.Entry<Double, Double> dot : stubs.entrySet()) {
            when(mockCos.calculate(dot.getKey())).thenReturn(dot.getValue());
        }
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(sec.calculate(seriesValue), funcValue, AbstractFunction.EPSILON);
    }

}
