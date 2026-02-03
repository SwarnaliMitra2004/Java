/*Create a program using recursion to display the Fibonacci series upto a certain 
number. */

import java.util.Scanner;

public class FibonacciRecursion {

    // Recursive method to calculate Fibonacci number at position n
    public static int fibonacci(int n) {
        if (n == 0) return 0;   // Base case
        if (n == 1) return 1;   // Base case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int terms = sc.nextInt();

        System.out.println("Fibonacci series up to " + terms + " terms:");

        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }
}
