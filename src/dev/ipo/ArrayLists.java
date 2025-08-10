package dev.ipo;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }
    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    };
}


public class ArrayLists {
    public static void main(String[] args) {
//        Object[] groceryArray = new Object[3];
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apple", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);

        // Because we have an array of objects, the compiler allows this
        System.out.println(Arrays.toString(groceryArray));

        // If you do not specify the type with ArrayList, it will specify type Object by default.
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        // Proper way to initialize, diamond operator, resizable so it's not a fixed size
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Oranges", "Produce", 5));

        // We can add a new item using an index to see where we would like to have it
//        groceryList.add(0, new GroceryItem("Apple", "Produce", 6));

        // You can use the set operator to replace an entry instead of adding
        groceryList.set(0, new GroceryItem("Apple", "Produce", 6));

        groceryList.remove(1);

        System.out.println(groceryList);

    };
}
