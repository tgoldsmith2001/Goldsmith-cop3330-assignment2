package org.example.ex025;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordValidator() {
        assertEquals(0, App.passwordValidator("12345"));
        assertEquals(1, App.passwordValidator("abcdef"));
        assertEquals(2, App.passwordValidator("abc123xyz"));
        assertEquals(3, App.passwordValidator("tyler123%$"));
    }
    @Test
    void hasNumber() {
        assertEquals(true, App.hasLetter("tyler1"));
        assertEquals(false, App.hasLetter("12345"));
        assertEquals(false, App.hasLetter(""));
    }
    @Test
    void hasLetter() {
        assertEquals(true, App.hasLetter("t0390392039"));
        assertEquals(false, App.hasLetter("0390392039"));
        assertEquals(false, App.hasLetter(""));
    }
    @Test
    void hasSpecial() {
        assertEquals(true, App.hasSpecial("tyler$"));
        assertEquals(false, App.hasSpecial("tyler"));
        assertEquals(false, App.hasSpecial(""));
    }
}