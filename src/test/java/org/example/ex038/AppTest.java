/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex038;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    String Str="0 1 2 3 4 5 6 7";
    Integer[] ints={0,1,2,3,4,5,6,7};
    Integer[] even={0,2,4,6};
    @Test
    void filterEvenNumbers() {
        assertArrayEquals(even,App.filterEvenNumbers(ints));
    }

    @Test
    void getIntsfromString() {
        assertArrayEquals(ints,App.getIntsfromString(Str));
    }
}