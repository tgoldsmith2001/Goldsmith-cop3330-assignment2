/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex028;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int total=0;
        int x=0;
        while(x<5) {
            total=updateTotal(total,readInt(input));
            x++;
        }
        System.out.println(output(total));
    }
    static String output(int total){
        return "The total is "+total;
    }
    static int updateTotal(int total, int addition){
        return total+addition;
    }
    static int readInt(Scanner input){
        int R;
        String RStr;
        while(true){
            try{
                System.out.printf("Enter a Number: ");
                RStr=input.nextLine();
                R=Integer.parseInt(RStr);
            }catch (Exception E){
                System.out.println("Value entered is not numeric...");
                return 0;
            }
            break;
        }
        return R;
    }
}
