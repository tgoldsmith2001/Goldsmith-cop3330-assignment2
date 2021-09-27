package org.example.ex032;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AppTest {

    @Test
    void getRandom() {
        int value= 0;
        //Check that value always returns within proper range
        for (int i = 0; i < 100; i++) {
            value=App.getRandom(1);
            assertTrue(value>=1 && value<=10);
        }
        for (int i = 0; i < 100; i++) {
            value=App.getRandom(2);
            assertTrue(value>=1 && value<=100);
        }
        for (int i = 0; i < 100; i++) {
            value=App.getRandom(3);
            assertTrue(value>=1 && value<=1000);
        }
    }
}