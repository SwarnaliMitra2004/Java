/*Create your own functional interface with a single abstract 
method that accepts an integer and returns a boolean. 
Implement it using a lambda that checks if the number is 
prime. */

@FunctionalInterface
interface PrimeCheck {
    boolean isPrime(int number);
}

public class PrimeLambdaExample {

    public static void main(String[] args) {

        // Lambda expression implementation
        PrimeCheck primeCheck = (num) -> {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        };

        // Testing the lambda
        int number = 29;
        System.out.println(number + " is prime: " + primeCheck.isPrime(number));
    }
}
