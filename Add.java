//Addtion of two numbers


import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float a= sc.nextFloat();
        System.out.println("Enter the second number : ");
        float b= sc.nextFloat(); 
        float add=a+b;
        System.out.println("Addtion of the given numbers = "+add);
    }
}
