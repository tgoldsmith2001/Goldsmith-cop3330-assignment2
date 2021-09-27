/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex037;
import java.util.Scanner;

public class App {
    //list of all letters of alphabet, numbers, and special characters stored as characters
    static String alphabet="abcdefghijklmnopqrstuvwxyz";
    static String numbers="0123456789";
    static String special="`~!@#$%^&*()-_=+[]\\{}|;':\",./<>?";
    static char[]Alphabet=alphabet.toCharArray();
    static char[]Numbers=numbers.toCharArray();
    static char[]Special=special.toCharArray();
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int min_length= readInt(input, "What's the minimum length?");
        int special=readInt(input, "How many special characters?");
        int numbers=readInt(input, "How many numbers?");
        //Ensures letter characters is more than the sum of special and numeric characters
        int length= ((special+numbers)*2)+1;
        //If the password doesn't have enough characters, add one letter character until length=min
        while(length<min_length){
            length++;
        }
        char[]Password= generatePassword(length,special,numbers);
        printArr(Password);
    }
    static void printArr(char[] Str){
        for(char C: Str){
            System.out.printf("%c",C);
        }
    }
    static char[] generatePassword(int length, int special, int numbers){
        //Sets amount of letters to the remaining spaces that aren't taken by numbers and special characters
        int charAmt=length-numbers-special;
        //Count for amount of numbers and special characters that still need to be placed
        int numAmt=numbers;
        int specialAmt=special;
        char[]Password= new char[length];
        for (int i = 0; i < length; i++) {
            //Random number to dictate which character type needs to be placed
            //0=Letter, 1=Number, 2=Special
            int randNum = random(2);
            //For loops check if char of the given type is available, and if so add that type to password
            //and deincrement the count on that type to indicate that one had been placed
                if (randNum == 0){
                    if(charAmt>0) {
                        Password[i] = getLetter();
                        charAmt--;
                    }else
                        //Case where letter isn't placed (all are taken)
                        i--;
                }else if (randNum == 1){
                    if(numAmt>0) {
                        numAmt--;
                        Password[i] = getNum();
                    }else
                        //Case where Number isn't placed (all are taken)
                        i--;
                }else if (randNum == 2){
                    if(specialAmt>0) {
                        specialAmt--;
                        Password[i] = getSpecial();
                    }else{
                        //Case where Special character isn't placed (all are taken)
                        i--;
                    }
                }
        }
        return Password;
    }
    static char getNum(){
        int ran= random(Numbers.length-1);
        return Numbers[ran];
    }
    static char getLetter(){
        int ran= random(Alphabet.length-1);
        return Alphabet[ran];
    }
    static char getSpecial(){
        int ran= random(Special.length-1);
        return Special[ran];
    }
    static int random(int max){
        return (int)(Math.round(Math.random()*max));
    }
    static int readInt(Scanner input, String Prompt){
        int R;
        String RStr;
        while(true){
            try{
                System.out.printf(Prompt+" ");
                RStr=input.nextLine();
                R=Integer.parseInt(RStr);
            }catch (Exception E){
                System.out.println("Sorry that is not a valid input. ");
                continue;
            }
            break;
        }
        return R;
    }
}
