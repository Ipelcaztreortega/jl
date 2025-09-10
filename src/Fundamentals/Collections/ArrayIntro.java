package Fundamentals.Collections;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        int[] firstFivePositives = new int[] {1, 2, 3, 4, 5};

        int[] firstTenNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Anonymous array

        int[] newArray;
        // newArray = {5, 4, 3, 2, 1}; This would not work, anonymous array initializer can only be used in a declaration statement.
//        newArray = new int[] {5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }

//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println(newArray[i] + " ");
//        };
//
//        for (int element: newArray) {
//            System.out.println(element +  " ");
//        }

        System.out.println(newArray);
        String arrayElementsInAString = Arrays.toString(newArray);
        System.out.println(arrayElementsInAString);

        Object objectVariable = newArray;

        if (objectVariable instanceof int[]) {
                System.out.println("objectVariable is really an int array");
        };

        // Creating an array of objects.
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;

        System.out.println(Arrays.toString(objectArray));
    };
}
