//Swapping


import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers you want to swap : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Initial value assigned to variable \'a\' : "+a);
        System.out.println("Initial value assigned to variable \'b\' : "+b);
        int t=a;
        a=b;
        b=t;
        System.out.println("After swapping value of variable \'a\' : "+a);
        System.out.println("After swapping value of variable \'b\' : "+b);
    }
}