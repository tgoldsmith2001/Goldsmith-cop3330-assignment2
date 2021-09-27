/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex035;
import java.util.Scanner;

public class App {
    //Note I decided to utilize an Array instead of an ArrayList
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String[] arr={};
        arr=readInput(input);
        int rand= getRandom(arr.length);
        System.out.println(output(arr[rand]));
    }
    static String output(String Str){
        return "The winner is... "+Str;
    }
    static String[] readInput(Scanner input){
        String[] arr={};
        while(true) {
            String current = readString(input);
            if(current.equals(""))
                break;
            arr=addtoArr(arr, current);
        }
        return arr;
    }
    static String readString(Scanner input){
        System.out.printf("Enter a name: ");
        return input.nextLine();
    }
    static int getRandom(int max){
        return (int)Math.round(Math.random()*(max-1));
    }
    /*Create a new array of size one greater than input array, copy original array into it,
    and add element into the last index of the array*/
    static String[] addtoArr(String[] orig, String addStr){
        String[] newArr= new String[orig.length+1];
        for (int i = 0; i < orig.length; i++) {
            newArr[i]=orig[i];
        }
        newArr[orig.length]=addStr;
        return newArr;
    }
}
