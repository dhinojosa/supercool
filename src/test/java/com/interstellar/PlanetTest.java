package com.interstellar;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlanetTest {
    @Test
    public void testAccessForGFromVenus() {
      Planet venus = Planet.VENUS;
      double g = venus.G;
    }

    @Test
    public void testAccessFromThePlanetClass() {
        double g = Planet.G;
    }

    @Test
    public void testEnumAsAValue() {
        String name = Planet.JUPITER.name();
        System.out.println(name);
        assertThat(name).isEqualTo("JUPITER");
    }
}
