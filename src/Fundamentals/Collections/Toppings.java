package Fundamentals.Collections;
// Enum underneath is a class
public enum Toppings {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    // Add semicolon in order to add more customization
    public double getPrice(){
        return switch(this) {
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
    };
}
