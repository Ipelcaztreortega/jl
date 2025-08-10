// This will not use encapsulation to show how important it is to have encapsulation
// This has no constructor
class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game");
        };
    };

    public int healthRemaining() {
        return health;
    };

    public void restoreHealth(int extraHealth) {
        if (health > 100) {
            System.out.println("Player restored to 100% health");
        };
        health = 100;
    }
}
