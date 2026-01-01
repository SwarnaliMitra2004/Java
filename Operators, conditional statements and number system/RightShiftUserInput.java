//Right shift 
/*
Explanation (Exam Friendly)
    Right shift operator >> shifts bits to the right
    Each shift divides the number by 2 
    20 >> 2 = 20 ÷ 2² = 5
*/


import java.util.Scanner;
public class RightShiftUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter number of positions to shift: ");
        int shift = sc.nextInt();

        int result = num >> shift;

        System.out.println("Result after right shift: " + result);

        sc.close();
    }
}
