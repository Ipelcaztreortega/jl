package dev.comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

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

//        System.out.println("result = " + tim.compareTo(new Student("TIM")));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
    }
};

class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
};


// Class has to derived from comparable to sort, but this may not be the best case, natural order is when two values compared to each other is 0 if they are the same.
class Student implements Comparable<Student> {

    private static int LAST_ID = 1000;
    private static Random random = new Random();

    String name; // Making this package protected
    private int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    };

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    };

    @Override
    public int compareTo(Student o) {
        // id is primitive int, less error prone, sorting by id
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    };

//    @Override
//    public int compareTo(@NotNull Object o) {
//        Student other = (Student) o; // We cast o which is passed to the method to a student type and assign it to a student variable, which allows us to compare
//        return name.compareTo(other.name);
//    };

}
