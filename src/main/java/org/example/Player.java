package org.example;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon waepon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.waepon = weapon;
        this.healthPercentage = healthPercentage;
        checkAndSetHealth(healthPercentage);

    }

    private void checkAndSetHealth(int healthPercentage) {
        if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }

    public void loseHealth(int damage) {
        int healthRemain = healthPercentage - damage;
        if (healthRemain <= 0) {
            System.out.println(name + " player has been knocked out of game");
        }

        healthPercentage = healthRemain;

        checkAndSetHealth(healthPercentage);
    }

    public void restoreHealth(int healthPotion) {
        this.healthPercentage = healthPercentage + healthPotion;
        checkAndSetHealth(this.healthPercentage);
    }

}
