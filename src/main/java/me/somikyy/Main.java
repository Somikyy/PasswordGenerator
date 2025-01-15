package me.somikyy;

public class Main {
    public static void main(String[] args) {
        int passwordLength = UserInputHandler.getValidPasswordLength();
        System.out.println("Password length: " + passwordLength);
        String password = PasswordGenerator.generatePassword(passwordLength, true, true ,true ,true, false);
        System.out.println("Password: " + password);
    }
}