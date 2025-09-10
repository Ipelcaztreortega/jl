package Fundamentals.exploringClasses;

import java.util.Comparator;

// generic to accept any type of employee, this class basically is used to sort
public class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName()); // We sort by name, because we have a getter for name since it is private
    }
}
