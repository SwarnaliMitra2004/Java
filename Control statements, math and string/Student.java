/*Define a Student class with fields like name and age, and use 
toString to print student details. */

public class Student {

    // Fields
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Student Name: " + name + ", Age: " + age;
    }

    // Main method to test
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Print student details using toString
        System.out.println(student1);
        System.out.println(student2);
    }
}
