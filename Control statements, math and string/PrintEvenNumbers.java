/*Create a program using continue to print only even numbers using continue for 
odd numbers. */

import java.util.Scanner;

public class PrintEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit (print even numbers from 1 to limit): ");
        int limit = sc.nextInt();

        System.out.println("Even numbers from 1 to " + limit + ":");

        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            System.out.println(i); // Print even numbers
        }

        sc.close();
    }
}
