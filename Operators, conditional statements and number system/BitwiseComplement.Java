// Bitwise compliment of a number


import java.util.Scanner;
public class BitwiseComplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = ~n;

        System.out.println("Bitwise Complement of " + n + " is: " + result);

        sc.close();
    }
}