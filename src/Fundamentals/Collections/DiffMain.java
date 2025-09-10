package Fundamentals.Collections;

public class DiffMain {
    public static void main(String... args) {
        System.out.println("Hello World again");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello", "World", "Again"); // Passing single string, not an array

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    };

    // Accepting variable argument for the string
    private static void printText(String... textList) {
        for (String t: textList) {
            System.out.println(t);
        }
    }
}
