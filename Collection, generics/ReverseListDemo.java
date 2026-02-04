/*Create a program that reverses the elements of a List and prints 
the reversed list. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Original List: " + list);

        // Reverse the list
        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
    }
}
