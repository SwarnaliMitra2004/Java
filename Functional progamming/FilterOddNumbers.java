/*Given a list of integers, use stream operations to filter odd 
numbers and print them. */

import java.util.Arrays;
import java.util.List;

public class FilterOddNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 23, 42, 7, 8, 19);

        numbers.stream()
               .filter(n -> n % 2 != 0)   // keep only odd numbers
               .forEach(System.out::println);
    }
}
