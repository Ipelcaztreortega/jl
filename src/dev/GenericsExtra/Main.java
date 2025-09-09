package dev.GenericsExtra;

import dev.GenericsExtra.utils.QueryList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < studentCount; i++) {
           students.add(new Student());
        };
        students.add(new LPAStudent());
//        printList(students);
        printMoreList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();

        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        };
//        printList(lpaStudents);
        printMoreList(lpaStudents);
        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1, 2, 3)));

        // Type is inferred and assigning it new query list class
        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches(
                "Course", "Python"
        );
        printMoreList(matches);

        var students2021 = queryList.<Student>getMatches(students, "YearStarted", "2021");
        printMoreList(students2021);
    };

    // Wildcard (type unknown) in the type argument (?), can only be used in a type argument
    // Cannot be used in an instantiation, can be unbounded, or either upper or lower bounded, here there is upperbound where anything coming in will be a student or its subtype
    // Lower bound will be super, a student or any parent of student
    public static void printMoreList(List<? extends Student> students) { // It will take in a list of any kind of type

        for (var student: students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    };

        public static void testList(List<?> list) {
        for (var element: list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }

        }
    }

//    public static void testList(List<String> list) {
//        for (var element: list) {
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }

    // Generic method, we use extends to specify an upper bound
//    public static <T extends Student> void printList(List<T> students) { // It will take in a list of any kind of type
//        for (var student: students) {
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }
}
