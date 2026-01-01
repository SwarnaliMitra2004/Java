//even or odd using bitwise operators
/*Logic
    The least significant bit (LSB) decides:
        0 → Even
        1 → Odd
    Use bitwise AND (&) with 1 
        n & 1 == 0  → Even
        n & 1 == 1  → Odd
*/



import java.util.Scanner;
public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if ((n & 1) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

        sc.close();
    }
}
