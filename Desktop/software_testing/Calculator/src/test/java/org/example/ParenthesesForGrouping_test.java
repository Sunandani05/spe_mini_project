package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParenthesesForGrouping_test {

    private static final double DELTA = 1e-10;

    @Test
    public void testSimpleExpression() {
        // Test a simple expression without parentheses
        String expression = "2 * 3 + 4";
        double result = ParenthesesForGrouping.evaluateExpression(expression);
        assertEquals(10.0, result, DELTA);
    }

    @Test
    public void testExpressionWithParentheses() {
        // Test an expression with parentheses
        String expression = "2 * (3 + 4)";
        double result = ParenthesesForGrouping.evaluateExpression(expression);
        assertEquals(14.0, result, DELTA);
    }

    @Test
    public void testComplexExpression() {
        // Test a more complex expression with multiple operators and parentheses
        String expression = "(5 * 3) + (6 / 2) - (4 + 1)";
        double result = ParenthesesForGrouping.evaluateExpression(expression);
        assertEquals(13.0, result, DELTA);
    }

    @Test
    public void testExpressionWithDecimalNumbers() {
        // Test an expression with decimal numbers
        String expression = "(3.5 + 2.5) * 2";
        double result = ParenthesesForGrouping.evaluateExpression(expression);
        assertEquals(12.0, result, DELTA);
    }

    @Test
    public void testEvaluateExpressionWithInvalidExpression() {
        // Test an expression with invalid characters, expecting an exception
        try {
            ParenthesesForGrouping.evaluateExpression("2+abc*3");
            fail("Expected IllegalArgumentException, but no exception was thrown.");
        } catch (IllegalArgumentException e) {
            // Success if an exception is thrown
        }
    }
}

