package com.anth0o0ny.functions.composite;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Map;

import com.anth0o0ny.functions.basic.Ln;
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
public class Log5Test {

    private final int BASE = 5;

    @Spy
    private Log log;
    @Mock
    private Ln mockLn = new Ln();

    @BeforeEach
    public void init() {
        this.log = new Log(mockLn, BASE);
        Map<Double, Double> stubs = ArgumentProvider.getStubs("Ln");
        for (Map.Entry<Double, Double> dot : stubs.entrySet()) {
            when(mockLn.calculate(dot.getKey())).thenReturn(dot.getValue());
        }
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(log.calculate(seriesValue), funcValue, AbstractFunction.EPSILON);
    }

}
