/*Create a PriorityQueue of a custom class Student with attributes 
name and grade. Use a comparator to order by grade. */

import java.util.PriorityQueue;
import java.util.Comparator;

// Student class
class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

// Main class
public class PriorityQueueStudentDemo {

    public static void main(String[] args) {

        // Comparator to order students by grade (ascending)
        Comparator<Student> gradeComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.grade, s2.grade);
            }
        };

        // PriorityQueue with custom comparator
        PriorityQueue<Student> pq = new PriorityQueue<>(gradeComparator);

        // Adding students
        pq.add(new Student("Alice", 85));
        pq.add(new Student("Bob", 92));
        pq.add(new Student("Charlie", 78));
        pq.add(new Student("Diana", 88));

        // Removing elements from PriorityQueue
        System.out.println("Students ordered by grade:");
        while (!pq.isEmpty()) {
            Student s = pq.poll();
            System.out.println(s.name + " - " + s.grade);
        }
    }
}
