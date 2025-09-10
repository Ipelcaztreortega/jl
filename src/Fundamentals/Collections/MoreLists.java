package Fundamentals.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args){
        String[] items = {"apples", "bananas", "milk", "eggs"};

        // Using a factory method, calling a static instance of that class, it returns a new instance of
        List<String> list = List.of(items); // Transformed an array of string to a list of string
        System.out.println(list);

        System.out.println(list.getClass().getName()); // Of type ListN, immutable

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")
        );
        System.out.println(nextList);
        groceries.addAll(nextList); // Takes any list as an argument
        System.out.println(groceries);

        // Indexing using get() instead of [];
        System.out.println(groceries.get(2));

        // Searching
        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        };

        groceries.add("Yogurt");
        System.out.println("First = " + groceries.indexOf("Yogurt"));
        System.out.println("Last = " + groceries.lastIndexOf("Yogurt"));

        // Removing
        groceries.remove(1);
        System.out.println(groceries);

        groceries.remove("Yogurt"); // Removes only the first element
        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "eggs")); // Removes all these elements
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese")); // Kind of an intersection
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty()); // Method to check if the list is empty

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese")); // Using static method with variable list of strings then passing that result to addAll
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);

        // Sorting
        groceries.sort(Comparator.naturalOrder()); // Allows instances to be compared to one another, we need it to sort
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder()); // Reverse alphabetical order
        System.out.println(groceries);

        // Getting a list from an array, with a different method on array list, commonly used version, takes typed array as an argument
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
