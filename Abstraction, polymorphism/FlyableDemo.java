/* Create an interface Flyable with an abstract method fly(). 
Create an abstract class Bird that implements Flyable. 
Implement a subclass Eagle that extends Bird. Provide an 
implementation for the fly() method.
 */

interface Flyable {
    void fly();   // abstract method
}

// Abstract class implementing interface
abstract class Bird implements Flyable {
    String name;

    Bird(String name) {
        this.name = name;
    }
}

// Subclass Eagle extending Bird
class Eagle extends Bird {

    Eagle(String name) {
        super(name);
    }

    // Implementing fly() method
    @Override
    public void fly() {
        System.out.println(name + " is flying high in the sky!");
    }
}

// Main class
public class FlyableDemo {
    public static void main(String[] args) {

        Flyable eagle = new Eagle("Golden Eagle");
        eagle.fly();
    }
}
