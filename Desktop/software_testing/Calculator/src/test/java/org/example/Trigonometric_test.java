package org.example;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Trigonometric_test {
    private static final double DELTA = 0.0001;

    @Test
    public void testSine() {
        assertEquals("Sine result is incorrect", 0.5, Trigonometric.sine(Math.PI / 6), DELTA);
    }

    @Test
    public void testCosine() {
        assertEquals("Cosine result is incorrect", Math.sqrt(3) / 2, Trigonometric.cosine(Math.PI / 6), DELTA);
    }

    @Test
    public void testTangent() {
        assertEquals("Tangent result is incorrect", 1.0 / Math.sqrt(3), Trigonometric.tangent(Math.PI / 6), DELTA);
    }

    @Test
    public void testArcsine() {
        assertEquals("Arcsine result is incorrect", Math.PI / 6, Trigonometric.arcsine(0.5), DELTA);
    }

    @Test
    public void testArccosine() {
        assertEquals("Arccosine result is incorrect", Math.PI / 6, Trigonometric.arccosine(Math.sqrt(3) / 2), DELTA);
    }

    @Test
    public void testArctangent() {
        assertEquals("Arctangent result is incorrect", Math.PI / 6, Trigonometric.arctangent(1.0 / Math.sqrt(3)), DELTA);
    }

    @Test
    public void testSecant() {
        assertEquals("Secant result is incorrect", 2.0, Trigonometric.secant(Math.PI / 3), DELTA);
    }

    @Test
    public void testCosecant() {
        assertEquals("Cosecant result is incorrect", 2.0000000000000004, 1 / Math.sin(Math.PI / 6), DELTA);
    }

    @Test
    public void testCotangent() {
        assertEquals("Cotangent result is incorrect", Math.sqrt(3), Trigonometric.cotangent(Math.PI / 6), DELTA);
    }

}
