package org.example.ex035;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void addtoArr() {
        String [] names= {"A","B","C","D","E"};
        String [] newStrings= {"A","B","C","D","E","F"};
        //Checks functionality of adding to an array
        assertArrayEquals(newStrings,App.addtoArr(names,"F"));
    }

    @Test
    void getRandom() {
        int value= 0;
        //Check that value always returns within proper range
        for (int i = 0; i < 100; i++) {
            value= App.getRandom(5);
            assertTrue(value>=0 && value<=4);
        }
    }
}