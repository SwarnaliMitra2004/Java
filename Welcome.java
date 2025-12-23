//Welcome message


import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter you name : "); 
      String name= sc.nextLine();
      System.out.println("Welcome, "+name+"to my GitHub repo."); 
    }
}
