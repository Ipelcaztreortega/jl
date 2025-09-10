package Fundamentals.Encapsulation;

public class PlayerEncap {
    public static void main(String[] args) {

        // What not to do
//        Player player = new Player();
//
//        // Initializing these fields directly, since we set the access to be public
//        player.name = "John";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        // A payer can set the health to 200
//        player.health = 200;
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());


        // Encapsulation, by making fields private, making sure fields within the class are not accessible to any classes outside of Fundamentals.Encapsulation.EnhancedPlayer class.
        EnhancedPlayer tim = new EnhancedPlayer("Tim");
//        Fundamentals.Encapsulation.EnhancedPlayer tim = new Fundamentals.Encapsulation.EnhancedPlayer("Tim", 200,"Sword"); This attempts to change the health to 200
        System.out.println("Initial Health is " + tim.healthRemaining());
    }
}
