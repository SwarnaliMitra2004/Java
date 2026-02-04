/*.Create a list of employees with name and salary fields. 
Write a comparator that sorts the employees by salary. 
Then, use this comparator to sort your list using the sort 
stream operation. */

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - ₹" + salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Amit", 50000),
                new Employee("Neha", 65000),
                new Employee("Rahul", 45000),
                new Employee("Priya", 60000)
        );

        // Comparator to sort by salary
        Comparator<Employee> salaryComparator =
                Comparator.comparingDouble(emp -> emp.salary);

        // Sorting using stream
        List<Employee> sortedEmployees = employees.stream()
                                                   .sorted(salaryComparator)
                                                   .collect(Collectors.toList());

        // Print sorted list
        sortedEmployees.forEach(System.out::println);
    }
}
