/*Use the Collections class to count the frequency of a particular 
element in an ArrayList. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FrequencyCountDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to count frequency: ");
        String element = sc.nextLine();

        int frequency = Collections.frequency(list, element);

        System.out.println("Frequency of \"" + element + "\" is: " + frequency);

        sc.close();
    }
}
