package Fundamentals.Collections;

import java.util.Arrays;

public class ArrayReferences {
    public static void main(String[] args) {
        int[] myIntArray = new int[5]; // The new operator creates a new object in memory.
        int[] anotherArray = myIntArray; // Assigning one reference to another.

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray); // We are passing the reference to the object not the object itself

        // Output will reflect the change in this reference change
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
    };

    private static void modifyArray(int[] array) {
        array[1] = 2;
    }
}
