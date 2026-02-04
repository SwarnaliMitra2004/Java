/*.Convert an array of strings into a stream. Then, use the 
stream to print each string to the console. */

import java.util.Arrays;

public class ArrayToStreamDemo {

    public static void main(String[] args) {

        String[] words = {"Java", "Streams", "Are", "Powerful"};

        // Convert array to stream and print each element
        Arrays.stream(words)
              .forEach(System.out::println);
    }
}
