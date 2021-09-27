/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex036;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    Integer[] arr1={};
    Integer[] arr2 ={100};
    Integer[] arr3={100,200};
    Integer[] arr4 ={100,200,1000};
    Integer[] arr5 ={100,200,1000,300};

    @Test
    void std() {
        assertEquals(353.55,App.std(arr5));
    }

    @Test
    void max() {
        assertEquals(1000,App.max(arr5));
    }

    @Test
    void min() {
        assertEquals(100,App.min(arr5));
    }

    @Test
    void average() {
        assertEquals(400.0, App.average(arr5));
    }

    @Test
    void addtoArr() {
        //Test each instance of adding an element to the array
        assertArrayEquals(arr2,App.addtoArr(arr1,100));
        assertArrayEquals(arr3,App.addtoArr(arr2,200));
        assertArrayEquals(arr4,App.addtoArr(arr3,1000));
        assertArrayEquals(arr5,App.addtoArr(arr4,300));
    }
}