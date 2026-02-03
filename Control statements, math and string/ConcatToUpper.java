/*Concatenate and Convert: Take two strings, concatenate them, 
and convert the result to uppercase. */

import java.util.Scanner;

public class ConcatToUpper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Concatenate strings and convert to uppercase
        String result = (str1 + str2).toUpperCase();

        System.out.println("Concatenated and Uppercase: " + result);

        sc.close();
    }
}
