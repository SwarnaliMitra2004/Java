/* Design a Course class.
• Instance variables: courseName, enrolledStudents.
• Static variable: maxCapacity, the maximum number of students for any 
course.
• Instance methods: enrollStudent(String studentName), 
unenrollStudent(String studentName).
• Static method: setMaxCapacity(int capacity), to set the maximum 
capacity for courses.
 */

import java.util.ArrayList;

public class Course {

    // Instance variables
    private String courseName;
    private ArrayList<String> enrolledStudents;

    // Static variable
    private static int maxCapacity;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Instance method to enroll a student
    public void enrollStudent(String studentName) {
        if (enrolledStudents.size() < maxCapacity) {
            if (!enrolledStudents.contains(studentName)) {
                enrolledStudents.add(studentName);
                System.out.println(studentName + " has been enrolled in " + courseName);
            } else {
                System.out.println(studentName + " is already enrolled in " + courseName);
            }
        } else {
            System.out.println("Cannot enroll " + studentName + ". " + courseName + " is full.");
        }
    }

    // Instance method to unenroll a student
    public void unenrollStudent(String studentName) {
        if (enrolledStudents.remove(studentName)) {
            System.out.println(studentName + " has been unenrolled from " + courseName);
        } else {
            System.out.println(studentName + " is not enrolled in " + courseName);
        }
    }

    // Static method to set maximum capacity
    public static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
        System.out.println("Maximum course capacity set to " + maxCapacity);
    }

    // Optional: display course info
    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students (" + enrolledStudents.size() + "): " + enrolledStudents);
        System.out.println("Maximum Capacity: " + maxCapacity);
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        // Set maximum capacity
        Course.setMaxCapacity(3);

        // Create courses
        Course math = new Course("Mathematics");
        Course physics = new Course("Physics");

        // Enroll students
        math.enrollStudent("Alice");
        math.enrollStudent("Bob");
        math.enrollStudent("Charlie");
        math.enrollStudent("David"); // Should fail, capacity full

        physics.enrollStudent("Eve");
        physics.enrollStudent("Bob"); // Bob can enroll in multiple courses

        // Unenroll student
        math.unenrollStudent("Charlie");
        math.unenrollStudent("Charlie"); // Should show not enrolled

        // Display course info
        math.displayCourseInfo();
        physics.displayCourseInfo();
    }
}
