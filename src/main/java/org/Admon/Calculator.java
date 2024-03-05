package org.Admon;

public class Calculator {

    public static double performOperation(double num1, double num2, int choice) {
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
                    result = Double.POSITIVE_INFINITY;
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
        return result;
    }
}
