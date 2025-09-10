package Fundamentals.LambdaIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"
        ));
        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("------");

        // It knows s is the element, part of the enhanced for loop using <T>
        list.forEach((s) -> System.out.println(s));

        System.out.println("------");
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(myString + " means " + first);
        });

        System.out.println("------");
        String prefix = "nato";
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(prefix + " " + myString + " means " + first);
        });
        int result = calculator((a, b) -> a + b, 5, 2);
        var result2 = calculator((a, b) -> a / b, 10.0, 2.5);
        var result3 = calculator((a, b) -> a.toUpperCase() + " " + b.toUpperCase(), "Ralph", "Kramden");
    }

    public static <T> T calculator (BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

//    public static <T> T calculator (Operation <T> function, T value1, T value2) {
//        T result = function.operate(value1, value2);
//        System.out.println("Result of operation: " + result);
//        return result;
//    }

}
