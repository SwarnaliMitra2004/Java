/*Create a class ArrayOperations with a static nested class Statistics. 
Statistics could have methods like mean(), median(), which 
operate on an array. */

import java.util.Arrays;

public class ArrayOperations {

    // Static nested class
    public static class Statistics {

        // Method to calculate mean of an array
        public static double mean(int[] arr) {
            if (arr == null || arr.length == 0) return 0;
            double sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum / arr.length;
        }

        // Method to calculate median of an array
        public static double median(int[] arr) {
            if (arr == null || arr.length == 0) return 0;
            int[] sorted = arr.clone(); // clone to avoid modifying original array
            Arrays.sort(sorted);
            int n = sorted.length;
            if (n % 2 == 0) {
                return (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;
            } else {
                return sorted[n / 2];
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Mean: " + Statistics.mean(numbers));
        System.out.println("Median: " + Statistics.median(numbers));
    }
}
