package org.example;

public class ParenthesesForGrouping {

    public static double evaluateExpression(String expression) {
        // For simplicity, this example assumes a basic arithmetic expression
        // with numbers, operators, and parentheses
        return evaluate(expression);
    }

    private static double evaluate(String expression) {
        // Implement a simple recursive parser for evaluating expressions with parentheses
        // This is a simplified version for illustration purposes
        // It does not handle all possible edge cases and error conditions

        char[] tokens = expression.toCharArray();
        int len = tokens.length;

        // Base case: If the expression is just a number, return its value
        if (len == 1 && Character.isDigit(tokens[0])) {
            return Double.parseDouble(String.valueOf(tokens[0]));
        }

        // Find the rightmost closing parenthesis
        int index = -1;
        for (int i = len - 1; i >= 0; i--) {
            if (tokens[i] == ')') {
                index = i;
                break;
            }
        }

        // If a closing parenthesis is found, find the corresponding opening parenthesis
        if (index != -1) {
            int openIndex = -1;
            for (int i = index - 1; i >= 0; i--) {
                if (tokens[i] == '(') {
                    openIndex = i;
                    break;
                }
            }

            // If both opening and closing parentheses are found, evaluate the expression inside them
            if (openIndex != -1) {
                String subExpression = expression.substring(openIndex + 1, index);
                double subResult = evaluate(subExpression);

                // Replace the expression inside parentheses with its result
                expression = expression.substring(0, openIndex) + subResult + expression.substring(index + 1);
                // Continue evaluating the modified expression
                return evaluate(expression);
            }
        }

        // If no parentheses are found, evaluate the entire expression
        return evaluateSimpleExpression(expression);
    }

    private static double evaluateSimpleExpression(String expression) {
        // A simple method to evaluate an arithmetic expression without parentheses
        // This method can be expanded to handle more complex expressions

        String[] tokens = expression.split("\\s+");
        double result = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double operand = Double.parseDouble(tokens[i + 1]);

            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }

        return result;
    }
}

