/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex024;
import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        String Str1, Str2;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two strings I will tell you if they are Anagrams:");
        String[] Strings= readStrings(input);
        //To ensure that the anagram is not case sensitive
        Strings[0]=Strings[0].toLowerCase(Locale.ROOT);
        Strings[1]=Strings[1].toLowerCase(Locale.ROOT);
        System.out.println(output(Strings[0],Strings[1]));
    }
    static String output(String Str1, String Str2){
        if(isAnagram(Str1,Str2))
            return (Str1+" and "+Str2+" are anagrams");
        else
            return(Str1+" and "+Str2+" are not anagrams");
    }
    static String[] readStrings(Scanner input){
        String[] inputStrings= new String[2];
        while(true) {
            System.out.printf("Enter the first String: ");
            inputStrings[0] = readString(input);
            System.out.printf("Enter the second String: ");
            inputStrings[1] = readString(input);
            if(inputStrings[0].length()==inputStrings[1].length())
                break;
            System.out.println("These two strings are not the same length try again...");
        }
        return inputStrings;
    }
    static String readString(Scanner input){
        return input.nextLine();
    }
    static Boolean isAnagram(String Str1, String Str2){
        int l=Str1.length();
        for(int i=0;i<l;i++){
            if(Str1.charAt(i)!=Str2.charAt(l-i-1))
                return false;
        }
        return true;
    }
}