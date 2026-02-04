/*Write a program that takes a string and returns the number of 
unique characters using a Set.
 */

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class UniqueCharactersCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Set<Character> uniqueChars = new HashSet<>();

        for (char ch : input.toCharArray()) {
            uniqueChars.add(ch);
        }

        System.out.println("Number of unique characters: " + uniqueChars.size());

        sc.close();
    }
}
