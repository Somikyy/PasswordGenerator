package me.somikyy;

import java.util.Scanner;

import static me.somikyy.PasswordGenerator.MAX_PASSWORD_LENGTH;

public class UserInputHandler {
    public static void main(String[] args) {
        int length = getValidPasswordLength();
        System.out.println("You entered: " + length + " digits.");
    }

    static int getValidPasswordLength() {
        Scanner scanner = new Scanner(System.in);
        int length = 0;

        while (length < 1 || length > MAX_PASSWORD_LENGTH) {
            System.out.print("Please enter a valid number between 1 and " + MAX_PASSWORD_LENGTH + ":");

            if (scanner.hasNextInt()) {
                length = scanner.nextInt();

                if (length < 1 || length > MAX_PASSWORD_LENGTH) {
                    System.out.println("ERROR: Number must be between 1 and " + MAX_PASSWORD_LENGTH + ".");
                }
            } else {
                System.out.println("ERROR: Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        return length;
    }
}