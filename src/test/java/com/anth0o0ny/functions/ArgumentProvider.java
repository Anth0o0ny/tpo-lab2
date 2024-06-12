package com.anth0o0ny.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import com.anth0o0ny.general.util.TestsHolder;

public class ArgumentProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        String contextName = context.getTestClass().get().getSimpleName();
        String funcName = contextName.substring(0, contextName.length() - 4);

        Map<Double, Double> testValue = TestsHolder.testValues.get(funcName);

        List<Arguments> args = new ArrayList<>();

        for (Map.Entry<Double, Double> entry: testValue.entrySet()) {
            args.add(Arguments.of(entry.getKey(), entry.getValue()));
        }

        return args.stream();
    }

    public static Map<Double, Double> getStubs(String funcName) {
        return TestsHolder.testValues.get(funcName);
    }

}
