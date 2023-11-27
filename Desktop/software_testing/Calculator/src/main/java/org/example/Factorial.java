package org.example;

public class Factorial {
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
