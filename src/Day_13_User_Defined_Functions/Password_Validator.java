package Day_13_User_Defined_Functions;

import java.util.Scanner;

public class Password_Validator {

    public static boolean isValidPassword(String password) {
        int minLength = 8; // Minimum password length
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return password.length() >= minLength && hasUppercase && hasLowercase && hasDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Strong password!");
        } else {
            System.out.println("Weak password. Please ensure it meets the following criteria:");
            System.out.println("- Minimum length of 8 characters");
            System.out.println("- Contains at least one uppercase letter");
            System.out.println("- Contains at least one lowercase letter");
            System.out.println("- Contains at least one digit");
        }

        scanner.close();
    }
}
