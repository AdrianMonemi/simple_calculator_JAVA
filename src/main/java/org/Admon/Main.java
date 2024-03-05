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

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
