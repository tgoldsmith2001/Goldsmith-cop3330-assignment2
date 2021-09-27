/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex024;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    String Scramble="ACBDGFE";
    String UnScramble="ABCDEFG";
    @Test
    void isAnagram() {
        assertEquals(true, App.isAnagram("helloworld","dlrowolleh"));
        assertEquals(true, App.isAnagram("resistance","ancestries"));
    }

    @Test
    void sortString() {
        assertArrayEquals(UnScramble.toCharArray(),App.sortString(Scramble));
    }
}