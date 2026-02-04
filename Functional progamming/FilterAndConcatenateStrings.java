/*Given a list of strings, use stream operations to filter out 
strings that have length of 10 or more and then 
concatenate the remaining strings. */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndConcatenateStrings {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList(
                "Java",
                "StreamAPI",
                "Programming",
                "Fun",
                "Code"
        );

        String result = strings.stream()
                .filter(s -> s.length() < 10)   // filter strings with length < 10
                .collect(Collectors.joining()); // concatenate

        System.out.println("Concatenated String: " + result);
    }
}
