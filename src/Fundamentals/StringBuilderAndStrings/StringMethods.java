package Fundamentals.StringBuilderAndStrings;

public class StringMethods {
    public static void main(String[] args) {
        String birthdate = "25/11/1982";
        int startingIndex = birthdate.indexOf("1982");

        System.out.println("Starting Index = " + startingIndex);
        System.out.println("Birth year = " + birthdate.substring(startingIndex)); // This is basically java's version of slice()

        System.out.println("Month = " + birthdate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982"); // Building a string with the elements with a delimiter spearating the elements
        System.out.println(newDate);

        // In order to use concat, you have to constantly redeclare it or do it once all in one declaration
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));


        // These take in regular expression as the first argument
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2)); // Way to remove spaces
        System.out.println("-".repeat(20));

    }
}
