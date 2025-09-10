package Fundamentals.Collections;

import java.util.Arrays;

public class NestedArrays {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

//        for (int[] outer: array2) {
//            System.out.println(Arrays.toString(outer));
//        };
//
//        for (var outer: array2) {
//            for (var element: outer) {
//                System.out.print(element + " ");
//            };
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(array2));

        array2[1] = new int[] {10, 20, 30}; // There is only 3 elements in the array, you cannot do anonymous array
        System.out.println(Arrays.deepToString(array2));
    }

}
