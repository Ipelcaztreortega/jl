package dev.ipo;

// Abstract class extending abstract class, can implement all parent abstract methods, some of them or none of them
abstract class Mammal extends Animal {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    };

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + "");
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    };
    public abstract void shedHair();
}


public abstract class Animal {
    protected String type; // Subclass can access type directly without a getter method
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    };

    // You cannot have an abstract methods that is private
    // When you declare abstract methods, you do not have a body, this forces subclass to declare their own methods
    public abstract void move(String speed);
    public abstract void makeNoise();

    // Abstract classes can also have concrete methods with a body that we can use in subclasses.
    public final String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }

}
