package me.somikyy;

import java.util.Scanner;

public class UserInputHandler {
    public static void main(String[] args) {
        int length = getValidPasswordLength();
        System.out.println("You entered: " + length + " digits.");
    }

    static int getValidPasswordLength() {
        Scanner scanner = new Scanner(System.in);
        int length = 0;

        while (length < 1 || length > 10000) {
            System.out.print("Please enter a valid number between 1 and 10000: ");

            if (scanner.hasNextInt()) {
                length = scanner.nextInt();

                if (length < 1 || length > 10000) {
                    System.out.println("ERROR: Number must be between 1 and 10000.");
                }
            } else {
                System.out.println("ERROR: Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        return length;
    }
}