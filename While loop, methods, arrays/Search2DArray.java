/*Create a program to search an element in a 2-D array. */

import java.util.Scanner;

public class Search2DArray {

    // Function to search for an element in 2-D array
    public static boolean searchElement(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {           // rows
            for (int j = 0; j < arr[i].length; j++) {    // columns
                if (arr[i][j] == key) {
                    System.out.println("Element found at row " + i + ", column " + j);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements of the 2-D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        if (!searchElement(arr, key)) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
