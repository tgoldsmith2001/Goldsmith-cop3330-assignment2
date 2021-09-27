/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex028;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AppTest {

    @Test
    void updateTotal() {
        assertEquals(15,App.updateTotal(10,5));
        assertEquals(10,App.updateTotal(10,0));
        assertEquals(10,App.updateTotal(0,10));
    }
}