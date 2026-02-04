/*Write two versions of a program that calculates the factorial 
of a number: one using structural (procedural) programming, 
and the other using functional programming. */

import java.util.Scanner;

public class FactorialProcedural {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Factorial of " + number + " is: " + factorial(number));
        sc.close();
    }
}
