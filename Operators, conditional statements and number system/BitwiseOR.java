//Bitwise OR of two numbers


import java.util.Scanner;
public class BitwiseOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = a | b;

        System.out.println("Bitwise OR of " + a + " and " + b + " is: " + result);

        sc.close();
    }
}
