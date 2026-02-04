/*Write a function that accepts a string and returns an 
Optional<String>. If the string is empty or null, return an 
empty Optional, otherwise, return an Optional containing the 
uppercase version of the string. */

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> toUpperCaseOptional(String input) {
        if (input == null || input.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(input.toUpperCase());
    }

    public static void main(String[] args) {

        Optional<String> result1 = toUpperCaseOptional("hello");
        Optional<String> result2 = toUpperCaseOptional("");
        Optional<String> result3 = toUpperCaseOptional(null);

        System.out.println(result1.orElse("Empty")); // HELLO
        System.out.println(result2.orElse("Empty")); // Empty
        System.out.println(result3.orElse("Empty")); // Empty
    }
}
