package dev.comparing;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        // 1 means greater, -1 means less, 0 means equal
        for (Integer i: others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);
        };

        String banana = "banana";
        String[] fruit = {"apple", "banana", " pear", "BANANA"};
        for (String s: fruit) {
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo=%d%n", banana,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        };

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        // Chars are stored in memory as positive
        System.out.println("A:" + (int)'A' + " " + "a:" + (int)'a');
        System.out.println("B:" + (int)'B' + " " + "b:" + (int)'b');
        System.out.println("P:" + (int)'P' + " " + "p:" + (int)'p');

        Student tim = new Student("Tim");
        Student[] students = {new Student("Zack"), new Student("Tim"), new Student("Ann")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = " + tim.compareTo("Mary"));
    }
};
// Class has to derived from comparable to sort
class Student implements Comparable{
    private String name;

    public Student(String name) {
        this.name = name;
    };

    @Override
    public String toString() {
        return name;
    };

    @Override
    public int compareTo(@NotNull Object o) {
        Student other = (Student) o; // We cast o which is passed to the method to a student type and assign it to a student variable, which allows us to compare
        return name.compareTo(other.name);
    };

}
