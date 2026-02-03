/* Create a program using for-each to find the maximum value in an integer array. */

import java.util.Scanner;

public class MaxValueArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize max with the first element
        int max = arr[0];

        // Using for-each loop to find maximum
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The maximum value in the array is: " + max);

        sc.close();
    }
}
