/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
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