package org.example.ex029;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void divide72by() {
        assertEquals(4,App.divide72by(18));
        assertEquals(1,App.divide72by(72));
        assertEquals(72,App.divide72by(1));
    }
}