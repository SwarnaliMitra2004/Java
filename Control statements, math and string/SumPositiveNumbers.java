/*Create a program using continue to sum all positive numbers entered by the 
user; skip any negative numbers. */

import java.util.Scanner;

public class SumPositiveNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        String input;

        System.out.println("Enter numbers to sum (type 'done' to finish):");

        while (true) {
            System.out.print("Enter number: ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break; // Exit loop when user types 'done'
            }

            int num;
            try {
                num = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                continue; // Skip invalid input
            }

            if (num < 0) {
                System.out.println("Negative number skipped.");
                continue; // Skip negative numbers
            }

            sum += num; // Add positive numbers to sum
        }

        System.out.println("Sum of all positive numbers: " + sum);

        sc.close();
    }
}
