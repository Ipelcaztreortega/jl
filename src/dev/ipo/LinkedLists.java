package dev.ipo;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {
        // Quick tip, when we looked at the linkedList or ArrayList, like below, will not work with primitive collections
        // LinkedList<int> places = new LinkedList() // This will not work directly


//        LinkedList<String> placesToVisit = new LinkedList<>();

        // Second way to initialize Linked List
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
//        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);

//        printItinerary(placesToVisit);
//        printItinerary2(placesToVisit);
//        printItinerary3(placesToVisit);
//        testIterator(placesToVisit);
        testListIterator(placesToVisit);
    };

    private static void addMoreElements(LinkedList<String> list) {
        // Methods that ArrayList does not have
        list.addFirst("Darwin");
        list.addLast("Hobart");

        // Queue Methods
        list.offer("Melbourne"); // Adds to the end
        list.offerFirst("Brisbane"); // Adds to the beginning
        list.offerLast("Toowoomba"); // Adds to the end

        // Stack Methods
        list.push("Alice Springs"); // Pushes last element to the front
    };

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // Removes the first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        // Queue/Deque poll methods
        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // pops out the first element
        System.out.println(p4 + " was removed") ;
    };

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position" + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position " + list.lastIndexOf("Melbourne"));

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element()); // This takes no arguements, but since it is a queue, you get the first element

        // Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    };

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From " + list.get(i - 1) + " to " + list.get(i));
        };
        System.out.println("Trip ends at " + list.getLast());
    };

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    };

    // Iterator is forwards only and only supports the remove method
    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1); // We pass the index of where we want to start
        while (iterator.hasNext()) { // Checks if there is an element next, points at position before the first element, bascially the null before head
            var town = iterator.next(); // Retrieves element
            System.out.println("--> From " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    };

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.remove(); // Provides a safe way to remove from LinkedList
            }
        };
        System.out.println(list);
    };

    // ListIterator allows forward and backward navigating. Add and set and remove methods work
    private static void testListIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.add("Lake Wivenhoe");
            }
        };


        // This is pointing after the last element since we looped one time
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
        System.out.println(iterator2.previous()); // The iterator cursor is at 3, and previous is Lake Wivenhoe

        // You must know that the actual elements are 0, 1, 2 and the iterator cursor (position) is before the element position
        // 0 -> 0th element -> 1 -> 1st element
    }

}
