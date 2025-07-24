import java.util.Scanner;

public class ReadingIO {
    // This approach is called catching and handling in exception.
    // Exception is an error that happens in code. Some types of errors can be predicted and named

    public static void main(String[] args) {
        int currentYear  = 2025;

        // Using the try and catch exceptions handling
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) { // Common practice to set value to e
            System.out.println(getInputFromScanner(currentYear));
        }
    };

    // Run this from terminal or commandline session
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your Name? "); // IDE disable console input reading
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth); // Parsing
        return "So you are " + age + " years old";
    };

    // The Scanner class is described as a simple text scanner, which can parse primitive types and strings
    // We have to create an instance of Scanner
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in); // We need to import a statement, pass the argument

        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        System.out.println("What year were you born? ");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth); // Parsing
        return "So you are " + age + " years old";
    };
}
