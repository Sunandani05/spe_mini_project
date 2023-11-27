package org.example;

import java.util.Arrays;

public class Statistical {

    public static double calculateMean(double[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Input array must not be empty for mean calculation");
        }
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public static double calculateMedian(double[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Input array must not be empty for median calculation");
        }
        Arrays.sort(values);
        int middle = values.length / 2;
        if (values.length % 2 == 0) {
            return (values[middle - 1] + values[middle]) / 2.0;
        } else {
            return values[middle];
        }
    }

    public static double calculateMode(double[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Input array must not be empty for mode calculation");
        }
        Arrays.sort(values);
        int maxCount = 0;
        double mode = Double.NaN;
        int currentCount = 1;

        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = values[i - 1];
                }
                currentCount = 1;
            }
        }

        if (currentCount > maxCount) {
            mode = values[values.length - 1];
        }

        return mode;
    }

    public static double calculateStandardDeviation(double[] values) {
        if (values.length < 2) {
            throw new IllegalArgumentException("Input array must have at least two elements for standard deviation calculation");
        }
        double mean = calculateMean(values);
        double sumSquaredDifferences = 0;

        for (double value : values) {
            sumSquaredDifferences += Math.pow(value - mean, 2);
        }

        return Math.sqrt(sumSquaredDifferences / (values.length - 1));
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer for factorial calculation");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}


