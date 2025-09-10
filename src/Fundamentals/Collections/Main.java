package Fundamentals.Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // These are all methods on the collection interface executed on a specific implementation, ArrayList assigned to list variable
//        List<String> list = new ArrayList<>();
//        Collection<String> list = new ArrayList<>();
//        Collection<String> list = new TreeSet<>();
        Collection<String> list = new HashSet<>();

        String[] names = {"Anna", "Bob", "Carol", "David", "Edna"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("Georgia", "Gary", "Grace"));
//        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("Gary is in the list? " + list.contains("Gary"));
    }
}
