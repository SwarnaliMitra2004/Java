/*Create a list of strings representing numbers ("1", "2", ...). 
Convert each string to an integer, then again calculating 
squares of each number using the map operation and sum 
up the resulting integers. */

import java.util.*;
import java.util.stream.*;

public class SquareSum {
    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");

        int sumOfSquares = numbers.stream()
                                  .map(Integer::parseInt)   // String → Integer
                                  .map(n -> n * n)          // Square
                                  .mapToInt(Integer::intValue)
                                  .sum();                   // Sum

        System.out.println("Sum of squares = " + sumOfSquares);
    }
}
