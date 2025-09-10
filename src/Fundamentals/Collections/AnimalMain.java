package Fundamentals.Collections;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
//        Fundamentals.Inheritance.Animal.Animal animal = new Fundamentals.Inheritance.Animal.Animal("animal", "big", 100); // You cannot create an instance of animal b/c abstract
        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        // Can hold any type of animal
        ArrayList<Animal>  animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barricuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));
        animals.add(new Horse("Black", "large", 500));

        // Enhanced for loop for all the values in animals
        for (Animal animal: animals) {
            doAnimalStuff(animal);
            // Code generically, get current variable currentMammal, we can call any method on Mammal class using variable currentMammal
            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }

    };

    private static void doAnimalStuff(Animal animal) { // You can use this type in declarations, to use the methods
        animal.makeNoise();
        animal.move("slow");
    }
}