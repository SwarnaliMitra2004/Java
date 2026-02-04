/*Write a lambda expression that takes two integers and 
returns their multiplication. Then, apply this lambda to a 
pair of numbers. */

@FunctionalInterface
interface Multiply {
    int multiply(int a, int b);
}

public class LambdaMultiplicationDemo {

    public static void main(String[] args) {

        // Lambda expression
        Multiply m = (a, b) -> a * b;

        // Apply lambda to numbers
        int result = m.multiply(6, 7);

        System.out.println("Multiplication result: " + result);
    }
}
