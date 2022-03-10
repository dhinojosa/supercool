package com.salesforce.functions;

import com.salesforce.collections.Combine;
import org.junit.Test;

import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionsTest {

    @Test
    public void testUsingCombine() {
        Combine combine = (a, b) -> a + b;
        assertThat(combine.combine(10, 20)).isEqualTo(30);
    }

    @Test
    public void testUsingFunction() {
        Function<String, Integer> f = String::length;
    }
}
