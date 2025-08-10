package dev.ipo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysAndArrayLists {
    public static void main(String[] args) {
        // Creating a new array
        String[] drinks = {"water", "soju", "horchata"};

        // Using List.of() to add drinks as a passable argument
        ArrayList<String> drinksList = new ArrayList<>(List.of(drinks));
        drinksList.add("Boba");
        System.out.println(drinksList);


        String[] originalArray = new String[] {"First", "Second", "Third"}; // Three element array

        // This method returns an ArrayList backed by an array, var lets us declare this variable without knowing the type exactly
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("List: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("Array: " + Arrays.toString(originalArray)); // Uppercase are less than lowercase letters

        // Since this list is backed by an array, we cannot add or remove elements
//        originalList.remove(0);

        // If you need to create a fixed size list, returns immutable list
        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

        // Two ways to create a list, both are static factory methods:

        // 1. Using Arrays.asList(), returned List is NOT resizable but is mutable
        var secondList = Arrays.asList("Monday", "Thursday");

        String[] days = new String[] {"Monday", "Friday"};
        List<String> newDays = Arrays.asList(days);


        // 2. List.of(), returned list is IMMUTABLE

        var listOne = List.of("Sunday", "Funday");
        String[] dias = new String[] {"Monday", "Friday"};
        List<String> listDia = List.of(dias);

        // Creating Arrays from ArrayLists
        ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb"));
        String[] stringArray = stringLists.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray));

    };
}
