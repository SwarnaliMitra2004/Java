//Multiplication table for given number


import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int i = 0;
        while(i < 11){
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;  // increment i to avoid infinite loop
        }

        sc.close();
    }
}