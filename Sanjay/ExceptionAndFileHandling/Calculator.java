package Sanjay.ExceptionAndFileHandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator\n");
        System.out.print("Enter your first number: ");
        int first = input.nextInt();
        System.out.print("Enter your second number: ");
        int second = input.nextInt();
        try {
            int result = first / second;
            System.out.printf("Result: %d", result);
        } catch (ArithmeticException exception) {
            System.out.printf("%s, Divide by zero, enter valid values", exception.getMessage());
        }
    }
}
