/* Create a class Person with attributes name and age. Override 
equals() to compare Person objects based on their attributes. 
Override hashCode() consistent with the definition of equals(). */

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters (optional)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override equals() to compare Person objects based on name and age
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

    // Override hashCode() consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Optional: override toString() for printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // Main method to test
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);

        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // false

        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
        System.out.println("p3.hashCode(): " + p3.hashCode());
    }
}
