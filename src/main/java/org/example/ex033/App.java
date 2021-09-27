/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex033;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String [] responses= {"Yes","No","Maybe","Ask again later"};
        int rand=getRandom();
        System.out.printf("Whats your question?\n>");
        input.nextLine();
        System.out.printf("\n"+responses[rand]);
    }
    static int getRandom(){
        return (int)Math.round(Math.random()*3);
    }
}
