/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex029;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double R= readDouble(input);
        System.out.println(output(divide72by(R)));
    }
    static String output(int A){
        return "It will take "+A+" years to double your initial investment";
    }
    static int divide72by(double d){
        return (int)Math.round(72/d);
    }
    static double readDouble(Scanner input){
        double R;
        String RStr;
        while(true){
            try{
                System.out.printf("What is the rate of return? ");
                RStr=input.nextLine();
                R=Double.parseDouble(RStr);
            }catch (Exception E){
                System.out.println("Sorry that is not a valid input. ");
                continue;
            }if(R==0){
                System.out.println("Sorry 0 is not a valid input. ");
                continue;
            }
            break;
        }
        return R;
    }
}
