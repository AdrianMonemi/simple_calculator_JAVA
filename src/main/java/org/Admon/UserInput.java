package org.Admon;

import java.util.Scanner;
class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a number.");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static int getIntInput(String prompt) {
        int input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                System.out.print(prompt);
                scanner.next(); // Consume the invalid input
            }
            input = scanner.nextInt();
            if (input < 1 || input > 4) {
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
            }
        } while (input < 1 || input > 4);
        return input;
    }

}