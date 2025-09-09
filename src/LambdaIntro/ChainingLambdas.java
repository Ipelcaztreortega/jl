package LambdaIntro;

import java.util.Arrays;
import java.util.function.Function;

public class ChainingLambdas {
    public static void main(String[] args) {
        String name = "Tim";

       // Function, takes string, results in string, uCase is declared to a String that will be held to upperCase
        Function<String, String> uCase = String::toUpperCase;
        System.out.println(uCase.apply(name));

        Function<String, String> lastName = s -> s.concat(" Butcher");
        Function<String, String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));

        // Does opposite of andThen method, it will execute lastName lambda first, then the function contained in uCase
        uCaseLastName = uCase.compose(lastName); // Only targets a function or urinary operator interface
        System.out.println(uCaseLastName.apply(name));

        Function<String, String[]> f0 = uCase
                .andThen(s -> s.concat(" Butcher"))
                .andThen(s -> s.split(" ")); // Returns string array
        System.out.println(Arrays.toString(f0.apply(name)));
    }
}
