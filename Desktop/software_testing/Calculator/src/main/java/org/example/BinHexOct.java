package org.example;

public class BinHexOct {
    //// Conversion methods
       public static String decimalToBinary(int decimal) {
           return Integer.toBinaryString(decimal);
        }

        public static String decimalToOctal(int decimal) {
           return Integer.toOctalString(decimal);
        }

        public static String decimalToHexadecimal(int decimal) {

           return Integer.toHexString(decimal).toUpperCase();
        }

        public static int binaryToDecimal(String binary) {

           return Integer.parseInt(binary, 2);
        }

        public static int octalToDecimal(String octal) {

           return Integer.parseInt(octal, 8);
        }

        public static int hexadecimalToDecimal(String hexadecimal) {

           return Integer.parseInt(hexadecimal, 16);
        }

        // Arithmetic operations

        public static String addBinary(String binary1, String binary2) {
            int decimalSum = binaryToDecimal(binary1) + binaryToDecimal(binary2);
            return decimalToBinary(decimalSum);
        }

        public static String addOctal(String octal1, String octal2) {
            int decimalSum = octalToDecimal(octal1) + octalToDecimal(octal2);
            return decimalToOctal(decimalSum);
        }

        public static String addHexadecimal(String hexadecimal1, String hexadecimal2) {
            int decimalSum = hexadecimalToDecimal(hexadecimal1) + hexadecimalToDecimal(hexadecimal2);
            return decimalToHexadecimal(decimalSum);
        }
    }



