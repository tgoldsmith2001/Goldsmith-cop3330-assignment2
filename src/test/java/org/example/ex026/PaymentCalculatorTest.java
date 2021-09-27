/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPayedOff() {
        double b=5000.0;
        double p=100.0;
        double i=0.12/365;
        PaymentCalculator PC= new PaymentCalculator();
        assertEquals(70,PC.calculateMonthsUntilPayedOff(b,p,i));
    }
}