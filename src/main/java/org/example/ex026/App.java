/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex026;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double balance,APR, monthly;
        //Creates a new instance of the PaymentCalculator class in order to utilize its function
        PaymentCalculator P= new PaymentCalculator();
        Scanner input= new Scanner(System.in);

        System.out.printf("What is your balance? ");
        //Statement rounds the input up to the next cent
        balance=Math.ceil(readDouble(input)*100.0)/100.0;
        System.out.printf("What is the APR on your card (as a percent)? ");
        APR=readDouble(input)/100;
        System.out.printf("What is the monthly payment you can make? ");
        monthly=Math.ceil(readDouble(input)*100.0)/100.0;;
        //Calls a function within P instance of the PaymentCalculator class
        System.out.format(output(P.calculateMonthsUntilPayedOff(balance,monthly,APR/365)));
    }
    static String output(int months){
        return "It will take you "+months+" months to pay off this card.";
    }
    static double readDouble(Scanner input){
        return input.nextDouble();
    }
}
