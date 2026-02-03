/*Create a program to merge two sorted arrays.*/

import java.util.Scanner;
import java.util.Arrays;

public class MergeSortedArrays {

    // Function to merge two sorted arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge arrays while both have elements
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array
        System.out.print("Enter size of first sorted array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second array
        System.out.print("Enter size of second sorted array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = mergeArrays(arr1, arr2);

        System.out.println("Merged sorted array: " + Arrays.toString(merged));

        sc.close();
    }
}
