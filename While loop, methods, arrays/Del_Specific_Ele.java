/*Create a program to return a new array deleting a specific element. */

import java.util.Scanner;
import java.util.Arrays;

class Del_Specific_Element{

    // Function to delete a specific element from the array
    public static int[] deleteSpecificElement(int[] arr, int key) {
        int count = 0;

        // Count occurrences of key
        for (int num : arr) {
            if (num == key) count++;
        }

        // Create new array of smaller size
        int[] newArr = new int[arr.length - count];
        int index = 0;

        for (int num : arr) {
            if (num != key) {
                newArr[index++] = num;
            }
        }

        return newArr;
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

        System.out.print("Enter element to delete: ");
        int key = sc.nextInt();

        int[] newArr = deleteSpecificElement(arr, key);

        System.out.println("Array after deleting " + key + ": " + Arrays.toString(newArr));

        sc.close();
    }
}
