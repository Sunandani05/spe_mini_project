package org.example;

public class Arithmetic {


    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static double absoluteValue(double num) {
        return Math.abs(num);
    }

    public static double negation(double num) {
        return -num;
    }

    public static double ceiling(double num) {
        return Math.ceil(num);
    }

    public static double floor(double num) {
        return Math.floor(num);
    }

    public static double round(double num) {
        return Math.round(num);
    }

    public static double max(double num1, double num2) {
        return Math.max(num1, num2);
    }

    public static double min(double num1, double num2) {
        return Math.min(num1, num2);
    }

}
