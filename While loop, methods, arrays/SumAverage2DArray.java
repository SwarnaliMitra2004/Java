/*Create a program to do sum and average of all elements in a 2-D array. */

import java.util.Scanner;

public class SumAverage2DArray {

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

        int sum = 0;
        int totalElements = rows * cols;

        // Calculate sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
        }

        double average = (double) sum / totalElements;

        System.out.println("Sum of all elements = " + sum);
        System.out.println("Average of all elements = " + average);

        sc.close();
    }
}
