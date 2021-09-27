package org.example.ex027;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void validateInput() {
        assertEquals("The first name must be at least 2 characters long\n",
                App.validateInput("T","Goldsmith","32828","ty-5618"));
        assertEquals("The last name must be at least 2 characters long\n",
                App.validateInput("Tyler","G","32828","ty-5618"));
        assertEquals("The employee ID must be in the form AA-1234\n",
                App.validateInput("Tyler","Goldsmith","32828","tyl-5618"));
        assertEquals("The zipcode must be a 5 digit number",
                App.validateInput("Tyler","Goldsmith","3282","ty-5618"));
        assertEquals("There were no errors found",
                App.validateInput("Tyler","Goldsmith","32828","ty-5618"));
    }

    @Test
    void validatefName() {
        assertEquals(true,App.validatefName("Ty"));
        assertEquals(false,App.validatefName("T"));
        assertEquals(false,App.validatefName(""));
    }

    @Test
    void validatelName() {
        assertEquals(true,App.validatelName("Goldsmith"));
        assertEquals(false,App.validatelName("G"));
        assertEquals(false,App.validatelName(""));
    }

    @Test
    void validateZIP() {
        assertEquals(true,App.validateZIP("32828"));
        assertEquals(false,App.validateZIP("3282"));
        assertEquals(false,App.validateZIP("abcde"));
    }

    @Test
    void validateID() {
        assertEquals(true,App.validateID("ty-5618"));
        assertEquals(false,App.validateID("ty_5618"));
        assertEquals(false,App.validateID("t1-5618"));
        assertEquals(false,App.validateID("ty-A618"));
        assertEquals(false,App.validateID("ty-618"));
        assertEquals(false,App.validateID("tyy-5618"));
    }
}