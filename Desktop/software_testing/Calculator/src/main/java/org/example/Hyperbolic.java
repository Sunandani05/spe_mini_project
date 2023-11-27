package org.example;

public class Hyperbolic {
        public static double hyperbolicSine(double angle) {
            return Math.sinh(angle);
        }

        public static double hyperbolicCosine(double angle) {
            return Math.cosh(angle);
        }

        public static double hyperbolicTangent(double angle) {
            return Math.tanh(angle);
        }

        public static double hyperbolicSecant(double angle) {
            return 1 / Math.cosh(angle);
        }

        public static double hyperbolicCosecant(double angle) {
            return 1 / Math.sinh(angle);
        }

        public static double hyperbolicCotangent(double angle) {
            return 1 / Math.tanh(angle);
        }



    }
