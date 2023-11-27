package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Choose the required Math operation:");
        System.out.println("---Arithmetic Operations---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Mod");
        System.out.println("6. Absolute Value");
        System.out.println("7. Negation");
        System.out.println("8. Ceiling");
        System.out.println("9. Floor");
        System.out.println("10. Round");
        System.out.println("11. Max");
        System.out.println("12. Min");

        System.out.print("Enter your choice : ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("enter two numbers:");
                System.out.println("enter first number:");
                int a = scanner.nextInt();
                System.out.println("enter second number:");
                int b = scanner.nextInt();
                double res = Arithmetic.add(a, b);
                System.out.println(res);
                break;
        }
    }
}