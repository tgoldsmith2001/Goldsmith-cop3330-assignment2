/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex026;
public class PaymentCalculator {
    public static int calculateMonthsUntilPayedOff(double b, double p, double i){
        double n=-((Math.log(1+b/p*(1-Math.pow((1+i),30)))) / Math.log(1+i))/30;
        int ret= (int)Math.ceil(n);
        return ret;
    }
}
