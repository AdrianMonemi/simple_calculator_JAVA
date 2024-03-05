package org.Admon;

public class Main {
    public static void main(String[] args) {
        double num1 = UserInput.getDoubleInput("Enter the first number: ");
        double num2 = UserInput.getDoubleInput("Enter the second number: ");

        System.out.println("Select the operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = UserInput.getIntInput("Enter your choice (1-4): ");
        double result = Calculator.performOperation(num1, num2, choice);
    }
}
