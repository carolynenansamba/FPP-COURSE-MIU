package Comparator;

import java.util.Collection;
import java.util.Comparator;

import java.util.*;

public class NameComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class EmployeeSort {
    public static void main(String[] args) {
        new EmployeeSort();
    }

    public EmployeeSort() {
        Employee[] empArray = {
                new Employee("George", 1996, 11, 5),
                new Employee("Dave", 2000, 1, 3),
                new Employee("Richard", 2001, 2, 7)
        };
        List<Employee> empList = Arrays.asList(empArray);
        Comparator<Employee> nameComp = new NameComparator();
        Collections.sort(empList, nameComp);
        System.out.println(empList);
    }
}

 class Employee {
    private String firstName;
    private Date hireDate;

    // Constructor
    public Employee(String firstName, int year, int month, int day) {
        this.firstName = firstName;
        this.hireDate = new Date(year - 1900, month - 1, day);
    }

    // Getter for firstName
    public String getName() {
        return firstName;
    }

    // Getter for hireDate
    public Date getHireDate() {
        return hireDate;
    }

    // Overriding toString() method to print Employee details
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
