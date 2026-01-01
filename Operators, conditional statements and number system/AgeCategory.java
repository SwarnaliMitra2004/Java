//Age group division


import java.util.Scanner;
public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age < 13) {
            System.out.println("Category: Child");
        } else if (age < 20) {
            System.out.println("Category: Teen");
        } else if (age < 60) {
            System.out.println("Category: Adult");
        } else {
            System.out.println("Category: Senior");
        }
        sc.close();
    }
}