package com.magicalarena;

import java.util.Random;

public class Arena {
    private static Random random = new Random();

    private static int rollDice() {
        return random.nextInt(6) + 1;
    }

    public static void attack(Player attacker, Player defender) {
        int attackRoll = rollDice();
        int defendRoll = rollDice();

        int attackDamage = attacker.attack * attackRoll;
        int defendStrength = defender.strength * defendRoll;

        int netDamage = Math.max(0, attackDamage - defendStrength);
        defender.health -= netDamage;

        System.out.println(attacker + " attacks with a roll of " + attackRoll + " (Damage: " + attackDamage + ")");
        System.out.println(defender + " defends with a roll of " + defendRoll + " (Defense: " + defendStrength + ")");
        System.out.println("Net damage to " + defender + ": " + netDamage);
        System.out.println(defender + "'s remaining health: " + defender.health + "\n");
    }

    public static void magicalArena(Player player1, Player player2) {
        int turn = 0;
        while (player1.isAlive() && player2.isAlive()) {
            System.out.println("Turn " + (turn + 1) + ":");

            if (player1.health < player2.health) {
                attack(player1, player2);
                if (player2.isAlive()) {
                    attack(player2, player1);
                }
            } else {
                attack(player2, player1);
                if (player1.isAlive()) {
                    attack(player1, player2);
                }
            }

            turn++;
        }

        Player winner = player1.isAlive() ? player1 : player2;
        System.out.println(winner + " wins the match after " + turn + " turns!");
    }
}
