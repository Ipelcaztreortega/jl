public class Car { // Statement to create new class, public is the access modifier/keyword

    // Class variables need an access modifier declared for it, if not then java declares it implicitly
    // Several private fields
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    // This is a getter method, this method is public, methods with non-static fields (instance), methods cannot be declared static
    public String getMake() {
        return make;
    };

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    // This uses "is" instead of get because this is the way for boolean values
    public boolean isConvertible() {
        return convertible;
    }

    // This is a setter method, you need to be specific in what you want to update, use keyword "this"
    public void setMake(String make) {
        if (make == null) {
            make = "Unknown";
        };
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "mazda", "toyota", "lexus" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        };
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    // Instance Method, designed to operate on the specific data of an object
    public void describeCar() {
        System.out.println(
                doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                        (convertible ? "Convertible" : "")
        );
    };
};
