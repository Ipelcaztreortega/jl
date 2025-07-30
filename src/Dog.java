// Using extends to show that Dog will inherit from Animal, we need a default constructor (empty) one.
public class Dog extends Animal{

    // Dog specific fields
    private String earShape;
    private String tailShape;

    public Dog () {
        super("Mutt", "Big", 500); // Implicit constructor, way to call default constructor on the parent or superclass
    };

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight); // To set animal specific fields

        this.earShape = earShape;
        this.tailShape = tailShape;
    };

    // This makes it simpler to create a dog object for a majority of dogs if there ears are Perky and tails are Curled
    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    };

    // This is so the Dog can have a behavior that the animal does not have
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Owwwwowowowowo!");
        }
        bark();
        System.out.println();
    };

    // Generated override has the @Override
    @Override
    public void move(String speed) {
        super.move(speed);
        // System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        };
        System.out.println();
    };

    // Creating private dog behaviors
    private void bark() {
        System.out.println("Woof! ");
    };

    private void run() {
        System.out.println("Dog running ");
    }

    private void walk() {
        System.out.println("Dog walking ");
    };

    private void wagTail() {
        System.out.println("Tail Wagging ");
    }
}
