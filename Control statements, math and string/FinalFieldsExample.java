/*Create an object with final fields and a constructor to initialize 
them. */

public class FinalFieldsExample {

    // Final fields
    private final String name;
    private final int age;

    // Constructor to initialize final fields
    public FinalFieldsExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display object details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create object and initialize final fields via constructor
        FinalFieldsExample student = new FinalFieldsExample("Alice", 21);

        // Display the object's data
        student.display();
    }
}
