/*Create a program using do-while to find password checker until a valid 
password is entered. */

import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;
        String validPassword = "Open@123"; // Example valid password

        do {
            System.out.print("Enter your password: ");
            password = sc.nextLine();

            if (!password.equals(validPassword)) {
                System.out.println("Invalid password! Try again.");
            }

        } while (!password.equals(validPassword));

        System.out.println("Password accepted! Access granted.");

        sc.close();
    }
}
