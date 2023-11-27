package org.example;

public class MemoryOps {

    private static Double memoryValue = null;

    public static Double getMemoryValue() {
        return memoryValue;
    }

    public static void memoryRecall(double result) {
        if (memoryValue != null) {
            memoryValue = result;
        }
    }

    public static void memoryClear() {
        memoryValue = null;
    }

    public static void memoryAdd(double value) {
        if (memoryValue == null) {
            memoryValue = value;
        } else {
            memoryValue += value;
        }
    }

    public static void memorySubtract(double value) {
        if (memoryValue == null) {
            memoryValue = -value;
        } else {
            memoryValue -= value;
        }
    }
}

