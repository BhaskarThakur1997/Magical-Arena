package com.magicalarena;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void testPlayerIsAlive() {
        Player player = new Player(50, 5, 10);
        assertTrue(player.isAlive());
    }

    @Test
    public void testPlayerIsDead() {
        Player player = new Player(0, 5, 10);
        assertFalse(player.isAlive());
    }
}
