package org.example.ex031;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getTarget() {
        assertEquals(138, App.getTarget(22,65,0.55));
    }
}