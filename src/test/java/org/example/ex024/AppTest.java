package org.example.ex024;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void isAnagram() {
        assertEquals(true, App.isAnagram("helloworld","dlrowolleh"));
    }
}