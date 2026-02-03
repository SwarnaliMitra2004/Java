/*Create a program to calculate the absolute value of a given 
integer. */

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int absValue = (num < 0) ? -num : num;  // Calculate absolute value

        System.out.println("The absolute value of " + num + " is " + absValue);

        sc.close();
    }
}
