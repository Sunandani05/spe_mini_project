package org.example;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Exponential_test {
    @Test
    public void testPower() {
        assertEquals("Power result is incorrect", 8.0, Exponential.power(2.0, 3.0), 0.0001);
    }

    @Test
    public void testSquareRoot() {
        assertEquals("Square root result is incorrect", 4.0, Exponential.squareRoot(16.0), 0.0001);
    }

    @Test
    public void testCubeRoot() {
        assertEquals("Cube root result is incorrect", 3.0, Exponential.cubeRoot(27.0), 0.0001);
    }

    @Test
    public void testArbitraryRoot() {
        assertEquals("Arbitrary root result is incorrect", 2.0, Exponential.arbitraryRoot(4.0, 2.0), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testZeroArbitraryRoot() {
        Exponential.arbitraryRoot(8.0, 0.0);
    }
}
