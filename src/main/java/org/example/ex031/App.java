/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex031;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double age, restHR;
        age= readDouble(input, "Enter your age: ");
        restHR= readDouble(input, "Enter your Resting Heart Rate: ");
        printOutput(age,restHR, 55,5);
    }
    static double readDouble(Scanner input, String prompt){
        double ret;
        String S;
        while (true) {
            try {
                System.out.print(prompt);
                S = input.nextLine();
                ret = Double.parseDouble(S);
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                continue;
            }
            break;
        }
        return ret;
    }
    static double getTarget(double age, double restHR, double intensity){
        return((((220-age)-restHR)*intensity)+restHR);
    }
    static void printOutput(double age, double restHR, double start_Intensity, double increment){
        String Spacing="         ";
        System.out.println("Resting Pulse: "+restHR+"     Age: "+age+
                "\nIntensity   |  Rate"+"\n------------|--------");
        for (double i = start_Intensity; i < 100; i+=5) {
            double Target=Math.round(getTarget(age,restHR,i/100));
            System.out.println((int)i+"%"+Spacing+"|  "+(int)Target+" bpm");
        }
    }
}
