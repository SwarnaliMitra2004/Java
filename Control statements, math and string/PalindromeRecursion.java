/*Create a program using recursion to check if a string is a palindrome using 
recursion. */

import java.util.Scanner;

public class PalindromeRecursion {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true; // Base case: all characters checked
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false; // Characters don't match
        }
        return isPalindrome(str, start + 1, end - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = sc.nextLine();

        // Optional: ignore case and spaces
        String str = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        sc.close();
    }
}
