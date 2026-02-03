/* Create a program using break to read inputs from the user in a loop and break 
the loop if a specific keyword (like "exit") is entered. */

import java.util.Scanner;

public class InputUntilExit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter inputs (type 'exit' to quit):");

        while (true) {  // Infinite loop
            System.out.print("Input: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {  // Check for exit keyword
                System.out.println("Exiting the loop...");
                break;  // Exit the loop
            }

            System.out.println("You entered: " + input);
        }

        sc.close();
        System.out.println("Program terminated.");
    }
}
