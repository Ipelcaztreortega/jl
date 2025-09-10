package Fundamentals.Car;

public class CarOOP {
    public static void main(String[] args) {
        // Instantiating a new object
        Car car = new Car();
        car.setMake("Mazda");
        car.setModel("3");
        car.setDoors(4);
        car.setColor("grey");
        System.out.println("Make = " + car.getMake());
        car.describeCar();

        Car second = new Car();
        second.setMake("Toyota");
        second.setModel("Camry");
        second.setDoors(4);
        second.setColor("red");
        System.out.println("Make = " + second.getMake());
        second.describeCar();
    }
}
