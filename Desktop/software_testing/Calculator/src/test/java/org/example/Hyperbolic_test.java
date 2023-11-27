package org.example;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Hyperbolic_test {
    private static final double DELTA = 0.0001;

    @Test
    public void testHyperbolicSine() {
        assertEquals("Hyperbolic Sine result is incorrect", (Math.exp(1) - Math.exp(-1)) / 2, Hyperbolic.hyperbolicSine(1.0), DELTA);
    }

    @Test
    public void testHyperbolicCosine() {
        assertEquals("Hyperbolic Cosine result is incorrect", (Math.exp(1) + Math.exp(-1)) / 2, Hyperbolic.hyperbolicCosine(1.0), DELTA);
    }

    @Test
    public void testHyperbolicTangent() {
        assertEquals("Hyperbolic Tangent result is incorrect", (Math.exp(2) - 1) / (Math.exp(2) + 1), Hyperbolic.hyperbolicTangent(1.0), DELTA);
    }

    @Test
    public void testHyperbolicSecant() {
        assertEquals("Hyperbolic Secant result is incorrect", 2.0 / (Math.exp(1) + Math.exp(-1)),Hyperbolic.hyperbolicSecant(1.0), DELTA);
    }

    @Test
    public void testHyperbolicCosecant() {
        assertEquals("Hyperbolic Cosecant result is incorrect", 2.0 / (Math.exp(1) - Math.exp(-1)), Hyperbolic.hyperbolicCosecant(1.0), DELTA);
    }

    @Test
    public void testHyperbolicCotangent() {
        assertEquals("Hyperbolic Cotangent result is incorrect", (Math.exp(2) + 1) / (Math.exp(2) - 1), Hyperbolic.hyperbolicCotangent(1.0), DELTA);
    }
}
