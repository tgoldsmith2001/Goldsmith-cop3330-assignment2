/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex033;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getRandom() {
        int value= 0;
        //Check that value always returns within proper range
        for (int i = 0; i < 100; i++) {
            value= App.getRandom();
            assertTrue(value>=0 && value<=3);
        }
    }
}