package Fundamentals.interfaces;

enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECITON;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }
};

record DragonFly(String name, String type) implements FlightEnabled{

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
};

class Satellite implements OrbitEarth {
    // Did not copy implicit method modifier
    public void achieveOrbit() {
        System.out.println("Orbit Achieved!");
    };

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends  FlightEnabled{
    void achieveOrbit();
};

// Interfaces allow us to type our objects differently by behavior only
interface FlightEnabled {

    /*
     Any fields declared in instance fields are constants (implicitly public, static and final)

     A constant in java is a variable that cannot be changed
     A constant variable is a final variable of primitive type, or type String, that is initialized with a constant expression
     A constant is named with all uppercase and with underscores, a static constant means we can access it via the type name
    */
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;


    void takeOff();
    void land();
    void fly(); // This compiles because this modifier is implicitly declared for all interfaces both public and abstract
};

interface Trackable {
    void track();
};

public abstract class Animal {
    public abstract void move();
}
