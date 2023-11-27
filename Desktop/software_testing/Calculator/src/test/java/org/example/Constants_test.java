package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Constants_test {

    private static final double DELTA = 0.0001;

    @Test
    public void testPi() {
        assertEquals("Pi constant is incorrect", Math.PI, Constants.PI, DELTA);
    }

    @Test
    public void testEulerNumber() {
        assertEquals("Euler's number constant is incorrect", Math.E, Constants.E, DELTA);
    }
}

