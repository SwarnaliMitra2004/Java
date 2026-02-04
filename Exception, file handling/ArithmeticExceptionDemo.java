/* Arithmetic Exception Handling
Write a program that asks the user to enter two integers and 
then divides the first by the second. The program should 
handle any arithmetic exceptions that may occur (like 
division by zero) and display an appropriate message.
Key Points:
• Use Scanner to read user input.
• Implement a try-catch block to handle ArithmeticException.
• Display a user-friendly message if division by zero occurs.
 */

import java.util.Scanner;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second integer: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;   // May throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } finally {
            sc.close();
        }
    }
}
