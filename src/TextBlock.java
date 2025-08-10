public class TextBlock {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                            "\t\u2022 First Point\n" +
                            "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List: 
                    \u2022 First Point
                        \u2022 Sub Point
                """;
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d\n", age); // Will not work with println, printf

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age); // Type conversion

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i); // This means we set a width of 6 spaces
        }

        // We can also use System.format
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}
