/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex038;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String Str= readString(input);
        Integer[] numbers= getIntsfromString(Str);
        Integer[] even_numbers= filterEvenNumbers(numbers);
        System.out.print("The even numbers are: ");
        printIntegers(even_numbers);
    }
    static void printIntegers(Integer[] numbers){
        for(int num: numbers){
            System.out.printf("%d ",num);
        }
    }
    static Integer[] filterEvenNumbers(Integer[] numbers){
        int numEvens=0;
        for(int num: numbers){
            if(num%2==0)
                numEvens++;
        }
        Integer[]even_ints= new Integer[numEvens];
        int index=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0) {
                even_ints[index] = numbers[i];
                index++;
            }
        }
        return even_ints;
    }
    static Integer[] getIntsfromString(String Str){
        String [] numbers=Str.split(" ");
        Integer[] ints=new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            ints[i]=Integer.parseInt(numbers[i]);
        }
        return ints;
    }
    static String readString(Scanner input){
        System.out.printf("Enter a list of numbers, separated by spaces: ");
        return input.nextLine();
    }
}
