package org.example;

public enum Weapon {
    SWORD(10, 1.5),
    AXE(15, 1.2),
    BOW(8, 2.0);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
