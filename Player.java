package com.magicalarena;

public class Player {
    int health;
    int strength;
    int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    @Override
    public String toString() {
        return "Player[health=" + health + ", strength=" + strength + ", attack=" + attack + "]";
    }
}
