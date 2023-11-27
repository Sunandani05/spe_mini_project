package org.example;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Logarithmic_test {
    private static final double DELTA = 0.0001;

    @Test
    public void testNaturalLogarithm() {
        assertEquals("Natural logarithm result is incorrect", 1.0, Logarithmic.naturalLogarithm(Math.E), DELTA);
    }

    @Test
    public void testCommonLogarithm() {
        assertEquals("Common logarithm result is incorrect", 2.0, Logarithmic.commonLogarithm(100), DELTA);
    }

    @Test
    public void testExponentialFunction() {
        assertEquals("Exponential function result is incorrect", Math.E, Logarithmic.exponentialFunction(1.0), DELTA);
    }

    @Test
    public void testLogarithmBaseN() {
        assertEquals("Logarithm base N result is incorrect", 3.0, Logarithmic.logarithmBaseN(8, 2), DELTA);
    }

    @Test
    public void testPowerFunction() {
        assertEquals("Power function result is incorrect", 8.0, Logarithmic.powerFunction(2, 3), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNaturalLogarithmWithZero() {
        Logarithmic.naturalLogarithm(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCommonLogarithmWithZero() {
        Logarithmic.commonLogarithm(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLogarithmBaseNWithZero() {
        Logarithmic.logarithmBaseN(8, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLogarithmBaseNWithBaseOne() {
        Logarithmic.logarithmBaseN(8, 1);
    }
}
