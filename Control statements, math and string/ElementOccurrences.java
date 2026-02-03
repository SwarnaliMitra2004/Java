/*Create a program using for-each to the occurrences of a specific element in an 
array.  */

import java.util.Scanner;

public class ElementOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to count
        System.out.print("Enter the element to find occurrences of: ");
        int target = sc.nextInt();

        int count = 0;

        // Using for-each loop to count occurrences
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("The element " + target + " occurs " + count + " time(s) in the array.");

        sc.close();
    }
}
