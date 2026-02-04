/* Define a base class Vehicle with a method service() and a 
subclass Car that overrides service(). In Car's service(), 
provide a specific implementation that calls super.service() 
as well, to show how overriding works */

// Base class
class Vehicle {

    void service() {
        System.out.println("Vehicle is undergoing general servicing.");
    }
}

// Subclass
class Car extends Vehicle {

    @Override
    void service() {
        // Call parent class method
        super.service();

        // Car-specific behavior
        System.out.println("Car is receiving oil change and engine check.");
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle myCar = new Car();  // Polymorphism
        myCar.service();
    }
}
