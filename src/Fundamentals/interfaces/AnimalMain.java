package Fundamentals.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeOff();
//        flier.fly();
//        flier.land();
//        tracked.track();
        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);

        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        LinkedList<FlightEnabled> difffliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

//        triggerFliers(betterFliers);
//        flyFliers(betterFliers);
//        landFliers(betterFliers);

    };

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) { // Testing interface type
            tracked.track();
        };

        flier.land();
    };

    private static void triggerFliers(ArrayList<FlightEnabled> fliers) {
        for (var flier: fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(ArrayList<FlightEnabled> fliers) {
        for (var flier: fliers) {
            flier.fly();
        }
    };

    private static void landFliers(ArrayList<FlightEnabled> fliers) {
        for (var flier: fliers) {
            flier.land();
        }
    }
}
