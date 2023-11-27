package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinHexOct_test {
    @Test
    public void testDecimalToBinary() {
        assertEquals("Decimal to binary conversion is incorrect", "1010", BinHexOct.decimalToBinary(10));
    }

    @Test
    public void testDecimalToOctal() {
        assertEquals("Decimal to octal conversion is incorrect", "12", BinHexOct.decimalToOctal(10));
    }

    @Test
    public void testDecimalToHexadecimal() {
        assertEquals("Decimal to hexadecimal conversion is incorrect", "A", BinHexOct.decimalToHexadecimal(10));
    }

    @Test
    public void testBinaryToDecimal() {
        assertEquals("Binary to decimal conversion is incorrect", 10, BinHexOct.binaryToDecimal("1010"));
    }

    @Test
    public void testOctalToDecimal() {
        assertEquals("Octal to decimal conversion is incorrect", 10, BinHexOct.octalToDecimal("12"));
    }

    @Test
    public void testHexadecimalToDecimal() {
        assertEquals("Hexadecimal to decimal conversion is incorrect", 10, BinHexOct.hexadecimalToDecimal("A"));
    }

    @Test
    public void testAddBinary() {
        assertEquals("Binary addition is incorrect", "110", BinHexOct.addBinary("101", "1"));
    }

    @Test
    public void testAddOctal() {
        assertEquals("Octal addition is incorrect", "20", BinHexOct.addOctal("10", "10"));
    }

    @Test
    public void testAddHexadecimal() {
        assertEquals("Hexadecimal addition is incorrect", "E", BinHexOct.addHexadecimal("A", "4"));
    }
}
