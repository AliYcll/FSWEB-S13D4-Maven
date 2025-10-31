package org.example;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("John", 100, Weapon.SWORD);
        Point point = new Point(6, 5);

        System.out.println("Player: " + player.healthRemaining());
        System.out.println("Point: " + point.distance());
    }
}