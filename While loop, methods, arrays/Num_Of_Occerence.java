/* Create a program to find number of occurrences of an element in an 
array. */
import java.util.Scanner;

class NumOccurences{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to count: ");
        int key = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Number of occurrences of " + key + " = " + count);

        sc.close();
    }
}
