/* In a class Calculator, create multiple add() methods that 
overload each other and can sum two integers, three 
integers, or two doubles. Demonstrate how each can be 
called with different numbers of parameters */

class Calculator {

    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println("Sum of 2 integers: " + calc.add(10, 20));
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.5));
    }
}
