package com.magicalarena;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {

    @Test
    public void testAttack() {
        Player attacker = new Player(50, 5, 10);
        Player defender = new Player(100, 10, 5);
        Arena.attack(attacker, defender);

        assertTrue(defender.health < 100);
    }

    @Test
    public void testMagicalArena() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena.magicalArena(playerA, playerB);
        assertTrue(playerA.isAlive() || playerB.isAlive());
    }
}
