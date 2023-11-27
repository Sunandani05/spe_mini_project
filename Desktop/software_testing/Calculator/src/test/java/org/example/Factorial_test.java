package org.example;

import org.example.Factorial;
import org.junit.Test;
import static org.junit.Assert.*;

public class Factorial_test {

    @Test
    public void testFactorialOfZero() {
        assertEquals("Factorial of 0 is incorrect", 1, Factorial.calculateFactorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals("Factorial of 1 is incorrect", 1, Factorial.calculateFactorial(1));
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals("Factorial of 5 is incorrect", 120, Factorial.calculateFactorial(5));
    }

    @Test
    public void testFactorialOfTen() {
        assertEquals("Factorial of 10 is incorrect", 3628800, Factorial.calculateFactorial(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFactorial() {
        Factorial.calculateFactorial(-5);
    }
}



