package org.example;

public class Logarithmic {
    public static double naturalLogarithm(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Input value must be greater than 0 for natural logarithm");
        }
        return Math.log(value);
    }

    public static double commonLogarithm(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Input value must be greater than 0 for common logarithm");
        }
        return Math.log10(value);
    }

    public static double exponentialFunction(double exponent) {
        return Math.exp(exponent);
    }

    public static double logarithmBaseN(double value, double base) {
        if (value <= 0 || base <= 0 || base == 1) {
            throw new IllegalArgumentException("Input values must be greater than 0, and base must not be 1");
        }
        return Math.log(value) / Math.log(base);
    }

    public static double powerFunction(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
