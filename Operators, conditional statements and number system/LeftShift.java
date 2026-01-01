//Left shift operator

/*Explanation
    Left shift operator << shifts bits to the left
    Each shift multiplies the number by 2 
    5 << 2 = 5 × 2² = 20
*/


import java.util.Scanner;
public class LeftShift{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter number of positions to shift: ");
        int shift = sc.nextInt();

        int result = num << shift;

        System.out.println("Result after left shift: " + result);

        sc.close();
    }
}
