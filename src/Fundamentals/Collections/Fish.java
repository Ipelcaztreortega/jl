package Fundamentals.Collections;

public class Fish extends Animal{
    // Constructor must be called by every subclass constructor
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " gliding");
        } else {
            System.out.println(getExplicitType() + " darting");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Goldfish") {
            System.out.println("Swish!");
        } else {
            System.out.println("Splash!");
        }
    }
}
