//Perimeter of a rectangle
//Perimeter of rectangle ABCD = A+B+C+D


import java.util.Scanner;
public class PerimeterRectangle{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the four sides of the rectangle (cm.): ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float perimeter=a+b+c+d;
        System.out.println("Perimeter of the given rectangle is : "+perimeter+"cm.");
    }
}