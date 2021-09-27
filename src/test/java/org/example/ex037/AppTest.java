package org.example.ex037;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void getNum() {
        //Checks that each randomly generated char is within the number string
        for (int i = 0; i < 100; i++) {
            char letter= App.getNum();
            //Returns index of the generated char and -1 if char is not found
            assertTrue(App.numbers.indexOf(letter)!=-1);
            assertTrue(App.alphabet.indexOf(letter)==-1);
            assertTrue(App.special.indexOf(letter)==-1);
        }
    }

    @Test
    void getLetter() {
        //Checks that each randomly generated char is within the alphabet string
        for (int i = 0; i < 100; i++) {
            char letter= App.getLetter();
            //Returns index of the generated char and -1 if char is not found
            assertTrue(App.alphabet.indexOf(letter)!=-1);
            //Checks that character is not in of the type of the other two
            assertTrue(App.special.indexOf(letter)==-1);
            assertTrue(App.numbers.indexOf(letter)==-1);
        }
    }

    @Test
    void getSpecial() {
        //Checks that each randomly generated char is within the special character string
        for (int i = 0; i < 100; i++) {
            char specialChar= App.getSpecial();
            //Returns index of the generated char and -1 if char is not found
            assertTrue(App.special.indexOf(specialChar)!=-1);
            //Checks that character is not in of the type of the other two
            assertTrue(App.alphabet.indexOf(specialChar)==-1);
            assertTrue(App.numbers.indexOf(specialChar)==-1);
        }
    }

    @Test
    void random() {
        int value= 0;
        //Check that value always returns within proper range
        for (int i = 0; i < 100; i++) {
            value= App.random(10);
            assertTrue(value>=0 && value<=10);
        }
    }
}