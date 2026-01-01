//Calculate simple interest.
//Simple Interest = (P x T x R)/100 


import java.util.Scanner;
public class SimpleInterest {
   public static void main(String[] args) {
         Scanner sc= new Scanner(System.in); 
         System.out.println("Enter the principle amount : ");
         int p = sc.nextInt();
         System.out.println("Enter the rate of interest in points :");
         float r = sc.nextFloat();
         System.out.println("Enter the time period in years : ");
         int t = sc.nextInt();
         float SI = (p*r*t)/100;
         System.err.println("Simple interest based on the give data is : "+SI);
 }
}
