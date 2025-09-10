package Fundamentals.MathRandom;

import java.util.Random;

public class Calculator {
    public static void main(String[] args) {
        int maxMinusFive = Integer.MAX_VALUE - 5;
        // Throws an exception to prevent overflow, then allowing numbers to go negative
//        for (int j = 0, id = maxMinusFive; j< 10; Math.incrementExact(id), j++) {
//            System.out.printf("Assigning id %,d%n", id);
//        };

        System.out.println(Math.abs(-50));
        System.out.println(Math.abs(Integer.MIN_VALUE)); // Cause integer overflow
//        System.out.println(Math.absExact(Integer.MIN_VALUE)); // You get an exception


        System.out.println(Math.abs((long) Integer.MIN_VALUE));
        System.out.println("Max = " + Math.max(10, -10));
        System.out.println("Min = " + Math.min(10.0000002, 10.001f));

        // Rounding auto, where .5 and greater rounds up, else round down
        System.out.println("Round Down = " + Math.round(10.2));
        System.out.println("Round Up = " + Math.round(10.8));
        System.out.println("Round ? = " + Math.round(10.5));

        // Floor and ceil return a double
        System.out.println("Floor = " + Math.floor(10.8));
        System.out.println("Ceil = " + Math.ceil(10.2));

        // These two also return a double
        System.out.println("Square root of 100 = " + Math.sqrt(100));
        System.out.println("2 to the third power = " + Math.pow(2, 3));

        for (int i = 0; i < 10; i++) {
            // System.out.println(Math.random()); // Random between 0 and 1, can be zero but must be less than one
            // System.out.println(Math.random() * 10);
//             System.out.println((int) (Math.random() * 10));
            System.out.printf("%1$d =%1$c%n", (int)(Math.random() * 26) +65); // The format output is expecting a decimal and character

        };

        System.out.println("------------------");
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d =%1$c%n", r.nextInt(65, 91));
        };

        System.out.println("------------------");
        r.ints() // random streams
                .limit(10)
                .forEach(System.out::println);

        System.out.println("------------------");
        r.ints(10,0, 10) // adding the limit as an argument, along with the boundaries
                .forEach(System.out::println);

        // Seed
        long nanoTime = System.nanoTime();
        Random psuedoRandom = new Random(nanoTime);

        System.out.println("------------------");
        psuedoRandom.ints(10,0, 10) // adding the limit as an argument, along with the boundaries
                .forEach(i -> System.out.print(i + " "));

        Random notReallyRandom = new Random(nanoTime);
        System.out.println("\n------------------");
        notReallyRandom.ints(10,0, 10) // adding the limit as an argument, along with the boundaries
                .forEach(i -> System.out.print(i + " "));

        // Nano time is a different seed each time except for these two
    }
}
