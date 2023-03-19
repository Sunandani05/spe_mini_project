package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        do {
            System.out.println("SPE_Mini Project\nWelcome to scientific calculator \n Enter the choice of operation to perform:");
            System.out.print("1. Factorial\n2. Square root\n3. Power\n4. Natural Logarithm\n" +
                    "5. Exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // To calculate the factorial of the number
                    System.out.print("Enter any number :");
                    num1 = scanner.nextDouble();
                    System.out.println("Factorial of "+num1+" is : " + calculator.factorial(num1));
                    System.out.println("\n");

                    break;
                case 2:
                    // To calculate the square root of the number
                    System.out.print("Enter any number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Square root of "+num1+" is : " + calculator.squareRoot(num1));
                    System.out.println("\n");


                    break;
                case 3:
                    // To calculate num1 power of num2
                    System.out.print("Enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    System.out.println(num1+ " raised to power "+num2+" is : " + calculator.power(num1, num2));
                    System.out.println("\n");
                    break;
                case 4:
                    // To calculate the natural log of a number
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Natural log of "+num1+" is : " + calculator.naturalLog(num1));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }


    public double factorial(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        double result = fact(number1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }



    public double squareRoot(double number1) {
        logger.info("[SQ ROOT] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }


    public double power(double number1, double number2) {
        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        double result = Math.pow(number1,number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double naturalLog(double number1) {
        logger.info("[NATURAL LOG] - " + number1);
        double result = 0;

        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
    public double fact(double n) {
        double factorial = 1;
        for(int i = 1; i <= n; ++i)
        { factorial *= i;   }
        return  factorial;
    }
}