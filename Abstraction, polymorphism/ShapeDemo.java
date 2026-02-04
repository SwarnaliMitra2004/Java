/* Create an abstract class Shape with an abstract method 
calculateArea(). Implement two subclasses: Circle and 
Square. Each subclass should have relevant attributes (like 
radius for Circle, side for Square) and their own 
implementation of the calculateArea() method */

abstract class Shape {

    // Abstract method
    abstract double calculateArea();
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Square subclass
class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape square = new Square(4);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
    }
}
