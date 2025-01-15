package me.somikyy;

import java.util.Random;

public class PasswordGenerator {
    public static final int MAX_PASSWORD_LENGTH = 2000;
    public static String generatePassword(int length, boolean upperCase, boolean lowerCase, boolean specialChar, boolean number, boolean superspecial) {
        String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
        String numberChars = "0123456789";
        String specialChars = "-=!@#$%^&&*()_+,<>.?/|";
        String superspecialChars = "☺☻♥♦♣♠•◘○♂▬♀♪♫☼►◄↕‼¶§↨▬↓↑→↔←";

        StringBuilder allowedChars = new StringBuilder();

        if (upperCase) {
            allowedChars.append(upperCaseChars);
        }
        if (lowerCase) {
            allowedChars.append(lowerCaseChars);
        }
        if (number) {
            allowedChars.append(numberChars);
        }
        if (specialChar) {
            allowedChars.append(specialChars);
        }
        if (superspecial) {
            allowedChars.append(superspecialChars);
        }

        if (allowedChars.isEmpty()) {
            throw new IllegalArgumentException("At least one character type must be selected.");
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allowedChars.length());
            password.append(allowedChars.charAt(index));
        }

        return password.toString();
    }
}