package dev.ipo;

import java.util.ArrayList;
import java.util.Arrays;

public class Autoboxing {
    public static void main(String[] args) {
        // Boxing to be able to use in some classes like LinkedList


        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
//        Integer deprecated = new Integer(15); // Deprecated
        int unboxedInt = boxedInt;

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive(); // Returns primitive but jvm is boxing it
        double resultUnboxed = getDoubleObject(); // Returns boxed but jvm unboxes it

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray)); // The remaining values are null, integer wrapper class are classes

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1, 2, 3, 4, 5);
//        var ourList = List.of(1, 2, 3, 4, 5); // This returns an unmodifiable list
        System.out.println(ourList);

    };

    // single parameter, variable argument declaration, for the int primitive,
    private static ArrayList<Integer> getList(int... varargs) { // also works with (Integer... varargs)
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i: varargs) {
            aList.add(i);
        };
        return aList;
    };

    // take java.lang.Integer parameter as an argument
    private static int retunAnInt(Integer i) { // java unboxed i argument to return primitive int
        return i;
    };

    private static Integer returnAnInteger(int i) {
        return i;
    };

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    };

    private static double getLiteralDoublePrimitive() {
        return 100.00;
    }
}
