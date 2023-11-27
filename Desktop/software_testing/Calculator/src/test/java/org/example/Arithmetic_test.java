package org.example;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Arithmetic_test {
    @Test
    public void testAddition() {
        assertEquals("Addition result is incorrect", 8.0, Arithmetic.add(5.0, 3.0), 0.0001);
    }

    @Test
    public void testSubtraction() {
        assertEquals("Subtraction result is incorrect", 2.0, Arithmetic.subtract(5.0, 3.0), 0.0001);
    }

    @Test
    public void testMultiplication() {
        assertEquals("Multiplication result is incorrect", 15.0, Arithmetic.multiply(5.0, 3.0), 0.0001);
    }

    @Test
    public void testDivision() {
        assertEquals("Division result is incorrect", 2.0, Arithmetic.divide(6.0, 3.0), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Arithmetic.divide(5.0, 0.0);
    }

    @Test
    public void testModulus() {
        assertEquals("Modulus result is incorrect", 1.0, Arithmetic.modulus(5.0, 2.0), 0.0001);
    }

    @Test
    public void testAbsoluteValue() {
        assertEquals("Absolute value result is incorrect", 5.0, Arithmetic.absoluteValue(-5.0), 0.0001);
    }

    @Test
    public void testNegation() {
        assertEquals("Negation result is incorrect", -10.0, Arithmetic.negation(10.0), 0.0001);
    }

    @Test
    public void testCeiling() {
        assertEquals("Ceiling result is incorrect", 11.0, Arithmetic.ceiling(10.1), 0.0001);
    }

    @Test
    public void testFloor() {
        assertEquals("Floor result is incorrect", 10.0, Arithmetic.floor(10.9), 0.0001);
    }

    @Test
    public void testRound() {
        assertEquals("Round result is incorrect", 11.0, Arithmetic.round(10.5), 0.0001);
    }

    @Test
    public void testMax() {
        assertEquals("Max result is incorrect", 5.0, Arithmetic.max(3.0, 5.0), 0.0001);
    }

    @Test
    public void testMin() {
        assertEquals("Min result is incorrect", 3.0, Arithmetic.min(3.0, 5.0), 0.0001);
    }
}
