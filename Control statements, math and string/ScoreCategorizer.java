/*Create a program to Based on a student's score, categorize as 
"High", "Moderate", or "Low" using the ternary operator (e.g., 
High for scores > 80, Moderate for 50-80, Low for < 50) */

import java.util.Scanner;

public class ScoreCategorizer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = sc.nextInt();

        String category = (score > 80) ? "High" 
                         : (score >= 50) ? "Moderate" 
                         : "Low";

        System.out.println("The student's score category is: " + category);

        sc.close();
    }
}
