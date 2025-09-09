package dev.exploringClasses.burger;

public class Store {
    public static void main(String[] args){
        Meal regularMeal = new Meal();
        System.out.println(regularMeal);

        Meal USRegulareMeal = new Meal(0.68);
        System.out.println(USRegulareMeal);
    }
}
