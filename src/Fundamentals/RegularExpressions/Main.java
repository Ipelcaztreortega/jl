package Fundamentals.RegularExpressions;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String testString = "Anyone can Learn abc's, 123's, and any regular expression";
        String replacement = "(-)";

        String[] patterns = {
                "[a-zA-Z]*$", // $ Matches last character in a string
                "^[a-zA-z]{3}",// ^ Matches last first character in a string, {3} pattern must appear exactly 3 times
                "[A-Z]*"
        };

        for (String pattern : patterns) {
            String output = testString.replaceFirst(pattern, replacement);
            System.out.println("Pattern: " + pattern + " => " + output);
        };

        String paragraph = """
                Double, double toil and trouble;
                Fire burn and caldron bubble.
                Fillet of a fenny snake,
                In the caldron boil and bake
                Eye of newt and toe of frog,
                Wool of bat and tongue of dog,
                Adder's fork and blind-worm's sting,
                Lizard's leg and howlet's wing,
                For a charm of powerful trouble,
                Like a hell-broth boil and bubble.
                """;

        String[] lines = paragraph.split("\\R"); // Basically any new line
        System.out.println("This paragraph has " + lines.length + " lines");
        String[] words = paragraph.split("\\s"); // Counts any and all whitespace, including new line character combinations
        System.out.println("This paragraph has " + words.length + " lines");

        System.out.println(paragraph.replaceAll("[a-zA-Z]+ble", "[GRUB]"));

        Scanner scanner = new Scanner(paragraph);
        // System.out.println(scanner.delimiter()); // passing the paragraph

        scanner.useDelimiter("\\R");
//        while (scanner.hasNext()) {
//            String element = scanner.next();
//            System.out.println(element);
//        }
        scanner.tokens()
                .map(s -> Arrays.stream(s.split("\\s+" )).count()) // the number of words per line
                .forEach(System.out::println);
        scanner.close();
    }
}
