/* Write a program that sorts a list of String objects in descending 
order using a custom Comparator. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortDescending {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Mango");
        words.add("Grapes");
        words.add("Orange");

        // Custom Comparator for descending order
        Comparator<String> descendingComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // reverse order
            }
        };

        Collections.sort(words, descendingComparator);

        System.out.println("Strings sorted in descending order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
