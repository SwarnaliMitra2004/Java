/*Given an array of integers, create a stream, use the distinct 
operation to remove duplicates, and collect the result into 
a new list. */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 4, 5, 1, 6};

        List<Integer> uniqueList = Arrays.stream(numbers)
                                          .distinct()
                                          .boxed()
                                          .collect(Collectors.toList());

        System.out.println("Unique elements: " + uniqueList);
    }
}
