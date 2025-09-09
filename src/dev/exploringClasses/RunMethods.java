package dev.exploringClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Anonymous classes
public class RunMethods {
    public static void main(String[] arg){
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019, "Target"),
                new StoreEmployee(10515, "Joe", 2021, "Walmart"),
                new StoreEmployee(10105, "Tom", 2020, "Macys"),
                new StoreEmployee(10215, "Marty", 2018, "Walmart"),
                new StoreEmployee(10322, "Bud", 2016, "Target")
        ));

        // instance of the top level employee comparator class
        var c0 = new EmployeeComparator<StoreEmployee>();

        // uses the static nested class on the employee class
        var c1 = new Employee.EmployeeComparator<StoreEmployee>();

        // using the inner class on store employee, creates instance of store employee first, then uses that to create an instance of the inner class
        var c2 = new StoreEmployee().new StoreComparator<StoreEmployee>();

        // Using local class
        class NameSort<T> implements Comparator<StoreEmployee> {

            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        var c3 = new NameSort<StoreEmployee>();

        // using anonymous class
        var c4 = new Comparator<StoreEmployee>() {

            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        // By name
        sortIt(storeEmployees, c0);
        sortIt(storeEmployees, c1);

        // By store
        sortIt(storeEmployees, c2);
        sortIt(storeEmployees, c3);
        sortIt(storeEmployees, c4);

        // anonymous class on the fly, passed as a method argument
        sortIt(storeEmployees, new Comparator<StoreEmployee>() {

            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

    };

    // generic method, type parameter of T, the first has to be a list of type T, the second is a comparator, is using super lower bound, means we can use comparator which is the same type as T or a super type of T.
    public static <T> void sortIt(List<T> list, Comparator<? super T> comparator) {
        System.out.println("Sorting with Comparator: " + comparator.toString());
        list.sort(comparator);
        for (var employee: list) {
            System.out.println(employee);
        }
    }
}
