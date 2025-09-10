package Fundamentals.Inheritance.Computer;

public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    };
};

// These three methods are all products. This is an IS-A relationship with product. A monitor is a product
class Monitor extends Product {
    private int size;
    private String resoultion;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    };

    public Monitor(String model, String manufacturer, int size, String resoultion) {
        super(model, manufacturer);
        this.size = size;
        this.resoultion = resoultion;
    };

    public void drawPixelAt(int x, int y, String color) {
        System.out.println(String.format("Drawing pixel at %d, %d in color %s", x, y, color));
    }
};

class Motherboard extends Product {
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    };

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    };

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
};

class ComputerCase extends Product {

    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    };

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    };

};
