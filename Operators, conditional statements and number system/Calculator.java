//Calculator


import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter two numbers (first number >=second number):");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float add = a+b;
        float sub = a-b;
        float mul= a*b;
        float div = a/b;
        float modulus = a%b;
        System.out.println("Addition : "+add);
        System.out.println("Substraction : "+sub);
        System.out.println("Multiplication : "+mul);
        System.out.println("Division : "+div);
        System.out.println("Modulus : "+modulus);
    }
}
