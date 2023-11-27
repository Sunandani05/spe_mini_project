package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MemoryOps_test {

    private static final double DELTA = 1e-10;

    @Before
    public void setUp() {
        // Reset memory before each test
        MemoryOps.memoryClear();
    }



    @Test
    public void testMemoryClear() {
        MemoryOps.memoryRecall(42.0);
        MemoryOps.memoryClear();
        assertNull(MemoryOps.getMemoryValue());
    }

    @Test
    public void testMemoryAdd() {
        MemoryOps.memoryAdd(5.0);
        assertEquals(5.0, MemoryOps.getMemoryValue(), DELTA);

        MemoryOps.memoryAdd(7.0);
        assertEquals(12.0, MemoryOps.getMemoryValue(), DELTA);
    }

    @Test
    public void testMemorySubtract() {
        MemoryOps.memorySubtract(3.0);
        assertEquals(-3.0, MemoryOps.getMemoryValue(), DELTA);

        MemoryOps.memorySubtract(2.0);
        assertEquals(-5.0, MemoryOps.getMemoryValue(), DELTA);
    }
}
