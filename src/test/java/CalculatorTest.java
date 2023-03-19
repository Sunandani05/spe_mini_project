import org.example.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("True positive case: finding factorial of a number", 40320, calculator.fact(8), DELTA);
        assertEquals("True positive case: finding factorial of a number", 2, calculator.fact(2), DELTA);
        assertEquals("True positive case: finding factorial of a number", 1, calculator.fact(1), DELTA);
        assertEquals("True positive case: finding factorial of a number", 3628800, calculator.fact(10), DELTA);
        assertEquals("True positive case: finding factorial of a number", 1, calculator.fact(0), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("False positive case: finding factorial of a number", 113, calculator.fact(8), DELTA);
        assertNotEquals("False positive case: finding factorial of a number\"", 10, calculator.fact(2), DELTA);
        assertNotEquals("False positive case: finding factorial of a number\"", 42, calculator.fact(1), DELTA);
        assertNotEquals("False positive case: finding factorial of a number\"", 9, calculator.fact(10), DELTA);
        assertNotEquals("False positive case: finding factorial of a number\"", 0, calculator.fact(0), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("True positive case: finding power of num1 of num2", 64, calculator.power(2, 6), DELTA);
        assertEquals("True positive case: finding power of num1 of num2", 1, calculator.power(1, 113), DELTA);
        assertEquals("True positive case: finding power of num1 of num2", 27, calculator.power(3, 3), DELTA);
        assertEquals("True positive case: finding power of num1 of num2", 256, calculator.power(4, 4), DELTA);
        assertEquals("True positive case: finding power of num1 of num2", 125, calculator.power(5, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("False positive case: finding power of num1 of num2", 6, calculator.power(2, 6), DELTA);
        assertNotEquals("False positive case: finding power of num1 of num2", -7, calculator.power(1, 113), DELTA);
        assertNotEquals("False positive case: finding power of num1 of num2", 99, calculator.power(3, 3), DELTA);
        assertNotEquals("False positive case: finding power of num1 of num2", -12, calculator.power(5, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("True positive case: Finding natural log", 0, calculator.naturalLog(1), DELTA);

    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("False positive case: Finding natural log", 60, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("False positive case: Finding natural log\"", 4.7, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("True positive case: Finding square root", 4, calculator.squareRoot(16), DELTA);
        assertEquals("True positive case: Finding square root", 1, calculator.squareRoot(1), DELTA);
        assertEquals("True positive case: Finding square root", 9, calculator.squareRoot(81), DELTA);
        assertEquals("True positive case: Finding square root", 6, calculator.squareRoot(36), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("False positive case: Finding square root", 1, calculator.squareRoot(3), DELTA);
        assertNotEquals("False positive case: Finding square root", 3, calculator.squareRoot(4), DELTA);
        assertNotEquals("False positive case: Finding square root", 4, calculator.squareRoot(81), DELTA);
        assertNotEquals("False positive case: Finding square root", 2, calculator.squareRoot(36), DELTA);

    }


}
