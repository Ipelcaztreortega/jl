public class EnhancedPlayer {
    private String fullName; // Now you can use refactor
    private int healthPercentage;
    private String weapon;

    // Created overloaded constructor, made to create players easily with just a name
    public EnhancedPlayer(String fullName) {
        // When just a name is passed, this is initialized auto
        this(fullName, 100, "Sword");
    }

    // Use this constructor to be within the range 0 - 100
    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    };

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        };
    };

    public int healthRemaining() {
        return healthPercentage;
    };

    public void restoreHealth(int extraHealth) {
        if (healthPercentage > 100) {
            System.out.println("Player restored to 100% health");
        };
        healthPercentage = 100;
    }
}
