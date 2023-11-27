package org.example;

public class Exponential {
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double cubeRoot(double num) {
        return Math.cbrt(num);
    }

    public static double arbitraryRoot(double num, double root) {
        if (root == 0) {
            throw new ArithmeticException("Cannot calculate 0th root");
        }
        return Math.pow(num, 1.0 / root);
    }
}
