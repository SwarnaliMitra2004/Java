import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in); 
         System.out.println("Enter the principle amount : ");
         int p = sc.nextInt();
         System.out.println("Enter the rate of interest in points :");
         float r = sc.nextFloat();
         System.out.println("Enter the time period in years : ");
         int t = sc.nextInt();
         float CI = p*(1+(r/100))*t;
         System.out.println("Compond interest : "+CI);
}
}
