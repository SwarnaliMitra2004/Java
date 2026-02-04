/*Write a method concatenate Strings that takes variable arguments 
of String type and concatenates them into a single string. */

class StringConcatenator {

    // Method with variable arguments
    static String concatenateStrings(String... strings) {
        String result = "";

        for (String str : strings) {
            result += str;
        }

        return result;
    }

    public static void main(String[] args) {

        // Calling method with different number of arguments
        System.out.println(concatenateStrings("Hello", " ", "World"));
        System.out.println(concatenateStrings("Java", " ", "is", " ", "fun"));
        System.out.println(concatenateStrings("A", "B", "C", "D"));
    }
}
