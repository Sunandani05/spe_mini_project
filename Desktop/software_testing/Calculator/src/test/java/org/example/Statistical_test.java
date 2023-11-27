package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Statistical_test {

    private static final double DELTA = 0.0001;

    @Test
    public void testCalculateMean() {
        double[] values = {2, 4, 6, 8, 10};
        assertEquals("Mean calculation is incorrect", 6.0, Statistical.calculateMean(values), DELTA);
    }

    @Test
    public void testCalculateMedian() {
        double[] values = {1, 2, 3, 4, 5};
        assertEquals("Median calculation is incorrect", 3.0, Statistical.calculateMedian(values), DELTA);
    }

    @Test
    public void testCalculateMode() {
        double[] values = {2, 3, 4, 4, 5};
        assertEquals("Mode calculation is incorrect", 4.0, Statistical.calculateMode(values), DELTA);
    }

    @Test
    public void testCalculateStandardDeviation() {
        double[] values = {1, 2, 3, 4, 5};
        assertEquals("Standard deviation calculation is incorrect", 1.5811, Statistical.calculateStandardDeviation(values), DELTA);
    }

    @Test
    public void testCalculateFactorial() {
        assertEquals("Factorial of 5 is incorrect", 120, Statistical.calculateFactorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateMeanWithEmptyArray() {
        double[] values = {};
        Statistical.calculateMean(values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateMedianWithEmptyArray() {
        double[] values = {};
        Statistical.calculateMedian(values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateModeWithEmptyArray() {
        double[] values = {};
        Statistical.calculateMode(values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateStandardDeviationWithInsufficientData() {
        double[] values = {5};
        Statistical.calculateStandardDeviation(values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateFactorialWithNegativeInput() {
        Statistical.calculateFactorial(-5);
    }
}

