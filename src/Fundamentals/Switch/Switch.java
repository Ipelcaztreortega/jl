package Fundamentals.Switch;

public class Switch {
    // Traditional switch statement
    public static void main(String[] args) {
        char charValue =  'A';
        switch (charValue) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the switch");
        };
        System.out.println(enhancedTraditional("May"));
        System.out.println(moreEnhancedTrad("December"));
        advancedSwitch();
    };
    // Traditional switch statement used in a method, returning values
    public static String enhancedTraditional(String month) {
        switch (month) {
            case "January":
            case "February":
            case "March":
                return "1st";
            case "April":
            case "May":
            case "June":
                return "2nd";
            case "July":
            case "August":
            case "September":
                return "3rd";
            case "October":
            case "November":
            case "December":
                return "4th";
        };
        return "Invalid Month";
    };

    // Enhanced switch expression that uses keyword yield, allowing a more specific case
    public static String moreEnhancedTrad(String month) {
        return switch (month) {
            case "January", "February", "March" -> {yield "1st";}
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
//            default -> "Bad";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }

    //    Advanced Enhanced Fundamentals.Switch.Switch Statement
    public static void advancedSwitch() {
        char charVal =  'D';
        switch (charVal) {
            case 'A' -> System.out.println("A is able");
            case 'B' -> System.out.println("B is baker");
            case 'C', 'D', 'E' -> {
                System.out.println("Was either C, D, or E");
                System.out.println("Actually it is " + charVal);
            }
            default -> System.out.println("Letter " + charVal + " was not found in the switch");
        };
    };
}
