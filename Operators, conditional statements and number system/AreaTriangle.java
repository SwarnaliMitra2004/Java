// the Area of a Triangle. 
//Area of triangle = ½*B*H

import java.util.Scanner;
public class AreaTriangle {
        public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the base of the triangle (cm) : ");
        float b = sc.nextFloat();
         System.out.println("Enter the height of the triangle (cm) : ");
        float h = sc.nextFloat();
        float area =(b*h)/2;
        System.out.println("Area of the given triangle is : "+area+" cm.^2");
    }
}
