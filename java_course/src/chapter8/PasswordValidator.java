package chapter8;

import java.util.Scanner;

/*
Chapter 8 Strings Exercise
Validate the complexity of a proposed password by assuring it meets these rules:
* at least 8 characters long
* contain an uppercase letter
* contain a special character
* not contain the username
* not the same as the old password
 */
public class PasswordValidator {

    private static final String USERNAME = "UserName";
    private final String OLDPASSWORD;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Your password has expired.");
        System.out.println("Please enter your old password:");
        String oldPassword = scanner.next();
        PasswordValidator validator = new PasswordValidator(oldPassword);

        System.out.println("Please enter a new password: ");
        boolean isValid;

        do {
            var newPassword = scanner.next();

            isValid = validator.setNewPassword(newPassword);

            if (!isValid) System.out.println("New password is invalid, please pick a different password:");
            else System.out.println("You have successfully set your new password.");
        } while (!isValid);

        scanner.close();
    }

    public PasswordValidator(String password) {
        this.OLDPASSWORD = password;
    }

    /**
     * Validates a String against business requirements for passwords
     * @param password The String to be checked for validity
     * @return A boolean that is true if all business requirements have been met
     */
    public boolean setNewPassword(String password) {
        boolean sameAsOldPassword = OLDPASSWORD.equals(password);
        boolean containsUserName = password.contains(USERNAME);
        boolean isGreaterThan8Char = password.length() >= 8;
        boolean hasUppercase = hasUppercase(password);
        boolean hasSpecialChar = hasSpecialChar(password);

        return !sameAsOldPassword && !containsUserName &&
                isGreaterThan8Char && hasUppercase && hasSpecialChar;
    }

    /**
     * Checks a String for uppercase characters
      * @param password String to be checked
     * @return A boolean that describes if the String contains any uppercase letters
     */
    private boolean hasUppercase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check to see if a String contains any characters that are
     * not uppercase, lowercase, digits, or whitespace
     * @param password String to be checked
     * @return A boolean that describes if the String has any special characters
     */
    private boolean hasSpecialChar(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isUpperCase(password.charAt(i)) &&
                    !Character.isLowerCase(password.charAt(i)) &&
                    !Character.isDigit(password.charAt(i)) &&
                    !Character.isWhitespace(password.charAt(i))) return true;
        }
        return false;
    }
}
