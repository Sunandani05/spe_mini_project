package org.example;

public class Trigonometric {
    public static double sine(double angle) {
        return Math.sin(angle);
    }

    public static double cosine(double angle) {
        return Math.cos(angle);
    }

    public static double tangent(double angle) {
        return Math.tan(angle);
    }

    public static double arcsine(double value) {
        if (value < -1.0 || value > 1.0) {
            throw new IllegalArgumentException("Input value must be in the range [-1, 1]");
        }
        return Math.asin(value);
    }

    public static double arccosine(double value) {
        if (value < -1.0 || value > 1.0) {
            throw new IllegalArgumentException("Input value must be in the range [-1, 1]");
        }
        return Math.acos(value);
    }

    public static double arctangent(double value) {
        return Math.atan(value);
    }

    public static double secant(double angle) {
        return 1 / Math.cos(angle);
    }

    public static double cosecant(double angle) {
        return 1 / Math.sin(angle);
    }

    public static double cotangent(double angle) {
        return 1 / Math.tan(angle);
    }

}
