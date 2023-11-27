package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class AngularModeConversion_test {
    private static final double DELTA = 0.0001;

        @Test
        public void testDegreesToRadians() {
            assertEquals("Degrees to radians conversion is incorrect", Math.PI / 2, AngularModeConversion.degreesToRadians(90), DELTA);
        }

        @Test
        public void testRadiansToDegrees() {
            assertEquals("Radians to degrees conversion is incorrect", 90, AngularModeConversion.radiansToDegrees(Math.PI / 2), DELTA);
        }

        @Test
        public void testDegreesToRadiansZero() {
            assertEquals("Degrees to radians conversion is incorrect for zero", 0, AngularModeConversion.degreesToRadians(0), DELTA);
        }

        @Test
        public void testRadiansToDegreesZero() {
            assertEquals("Radians to degrees conversion is incorrect for zero", 0, AngularModeConversion.radiansToDegrees(0), DELTA);
        }

        @Test
        public void testDegreesToRadians360() {
            assertEquals("Degrees to radians conversion is incorrect for 360 degrees", 2 * Math.PI, AngularModeConversion.degreesToRadians(360), DELTA);
        }

        @Test
        public void testRadiansToDegrees2PI() {
            assertEquals("Radians to degrees conversion is incorrect for 2*pi radians", 360, AngularModeConversion.radiansToDegrees(2 * Math.PI), DELTA);
        }
    }



