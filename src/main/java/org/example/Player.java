package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage < 0) {
            this.healthPercentage = 0;
        }
    }

    public void restoreHealth(int health) {
        this.healthPercentage += health;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }
}
