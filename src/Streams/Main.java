package Streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
   public static void main(String[] args) {

       List<String> bingoPool = new ArrayList<>(75);
       int start = 1;

       for (char c : "BINGO".toCharArray()) {
           for (int i = start; i < (start + 15); i++) {
               bingoPool.add("" + c + i);
//               System.out.println("" + c + i);
           };
           start += 15;
       };

       Collections.shuffle(bingoPool);
       for (int i = 0; i < 15; i++) {
           System.out.println(bingoPool.get(i));
       }
       System.out.println("--------------------------");

       // List<String> firstOnes = bingoPool.subList(0, 15);

        // Make a copy of sublist if you don't want to alter the original
       List<String> firstOnes = new ArrayList<>(bingoPool.subList(0, 15));

       firstOnes.sort(Comparator.naturalOrder()); // Sorting first 15, string order
       firstOnes.replaceAll(s -> {
           if (s.indexOf('G') == 0 || s.indexOf("O") == 0) {
               String updated = s.charAt(0) + "-" + s.substring(1);
               System.out.print(updated + " ");
               return  updated;
           }
           return s;
       });
       System.out.println("\n--------------------------");

       // Everything done to the firstOnes list was done to the bingoPool, sublist returns a view, sublist alters the OG list
       for (int i = 0; i < 15; i++) {
           System.out.println(bingoPool.get(i));
       }
       System.out.println("--------------------------");

        // Using a stream (pipeline) this time, returns a stream so that we can chain it, basically printing out a subset of filtered data
       bingoPool.stream() // Source, stream comes from bingoPool list
               // Anything between source and terminal are intermediate operations, not requireed
               .limit(15)
               .filter(s -> s.indexOf('G') == 0 || s.indexOf("O") == 0)
               .map(s -> s.charAt(0) + "-" + s.substring(1)) // Similar to replaceAll
               .sorted()
               .forEach(s -> System.out.print(s + " ")); // Terminal Operation, required in order to execute the intermediate ops

       System.out.println("\n--------------------------");

       for (int i = 0; i < 15; i++) {
           System.out.println(bingoPool.get(i));
       }

       System.out.println("--------------------------");
       var tempStream = bingoPool.stream() // Source, stream comes from bingoPool list
               // Anything between source and terminal are intermediate operations, not requireed
               .limit(15)
               .filter(s -> s.indexOf('G') == 0 || s.indexOf("O") == 0)
               .map(s -> s.charAt(0) + "-" + s.substring(1)) // Similar to replaceAll
               .sorted();
//               .forEach(s -> System.out.print(s + " "));
       tempStream.forEach(s -> System.out.print(s + " "));

       // You can't reuse a stream
       System.out.println("\n--------------------------");

       String[] strings = {"One", "Two", "Three"};
       Arrays.stream(strings)
               .sorted(Comparator.reverseOrder())
               .forEach(System.out::println);

       // Without an input declaration
       Stream.of("Six", "Five", "Four")
               .map(String::toUpperCase) // shorthand notation for s -> s.toUpperCase()
               .forEach(System.out::println); // x -> System.out.println(x)
//       System.out.println("--------------------------");

       var firstStream = Arrays.stream(strings)
               .sorted(Comparator.reverseOrder());
//               .forEach(System.out::println);

       var secondStream =  Stream.of("Six", "Five", "Four")
               .map(String::toUpperCase);

       // Combined result of the two pipelines, each stream still performs different operations, once merged any operations after the source concat will be on the entire stream
       Stream.concat(secondStream, firstStream)
               .map(s -> s.charAt(0) + " - " + s)
               .forEach(System.out::println);

       Map<Character, int[]> myMap = new LinkedHashMap<>();
       int bingoIndex = 1;
       for (char c: "BINGO".toCharArray()) {
           int[] numbers = new int[15];
           int labelNo = bingoIndex;
           Arrays.setAll(numbers, i -> i + labelNo);
           myMap.put(c, numbers);
           bingoIndex += 15;
       }

       // Using stream to make sure the map looks good
       myMap.entrySet()
               .stream()
               .map(e -> e.getKey() + " has range: " + e.getValue()[0] + " - " + e.getValue()[e.getValue().length - 1]) // We get the key has range then the arrays first and last value
               .forEach(System.out::println);

       Random random = new Random();
       Stream.generate(() -> random.nextInt(2))
               .limit(10)
               .forEach(s -> System.out.print(s + " "));
       System.out.println();

       // Operates on a number seedd
       IntStream.iterate(1, n -> n + 1)
               .limit(20)
               .forEach(s -> System.out.print(s + " "));
   }
}
