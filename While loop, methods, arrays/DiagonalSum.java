/*Create a program to find the sum of two diagonal elements. */

import java.util.Scanner;

public class DiagonalSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr[i][i];             // Top-left to bottom-right
            secondaryDiagonalSum += arr[i][n - 1 - i];   // Top-right to bottom-left
        }

        System.out.println("Sum of primary diagonal = " + primaryDiagonalSum);
        System.out.println("Sum of secondary diagonal = " + secondaryDiagonalSum);

        sc.close();
    }
}
