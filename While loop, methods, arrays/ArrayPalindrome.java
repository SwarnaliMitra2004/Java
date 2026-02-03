/*Create a program to check is the array is palindrome or not. */

import java.util.Scanner;

public class ArrayPalindrome {

    // Function to check if an array is palindrome
    public static boolean isPalindrome(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isPalindrome(arr)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }

        sc.close();
    }
}
