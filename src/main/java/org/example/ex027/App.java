/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex027;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String fName,lName,ZIP,ID;
        Scanner input= new Scanner(System.in);
        System.out.printf("Enter your first name: ");
        fName=readString(input);
        System.out.printf("Enter your last name: ");
        lName=readString(input);
        System.out.printf("Enter your ZIP code: ");
        ZIP=readString(input);
        System.out.printf("Enter your Employee ID: ");
        ID=readString(input);
        System.out.println(validateInput(fName,lName,ZIP,ID));
    }
    static String readString(Scanner input){
        return input.nextLine();
    }
    /*Takes in the 4 input variables as strings and returns the combination string of the errors
    that are indicated by the validate functions below*/
    static String validateInput(String fName, String lName, String ZIP, String ID){
        String Str1="", Str2="", Str3="", Str4="";
        if(!validatefName(fName))
            Str1="The first name must be at least 2 characters long\n";
        if(!validatelName(lName))
            Str2="The last name must be at least 2 characters long\n";
        if(!validateID(ID))
            Str3="The employee ID must be in the form AA-1234\n";
        if(!validateZIP(ZIP))
            Str4="The zipcode must be a 5 digit number";
        if(validatefName(fName)&validatelName(lName)&validateID(ID)&validateZIP(ZIP))
            return "There were no errors found";
        return Str1+Str2+Str3+Str4;
    }
    //returns true if input String has at least 2 characters, returns false otherwise
    static Boolean validatefName(String fName){
        return(fName.length()>=2);
    }
    //returns true if input String has at least 2 characters, returns false otherwise
    static Boolean validatelName(String lName){
        return(lName.length()>=2);
    }
    //returns true if input String has exactly 5 characters and is all numbers, returns false otherwise
    static Boolean validateZIP(String ZIP){
        //Checks that every section of ZIP string is number, if not return false
        for(char c : ZIP.toCharArray()){
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        //If it gets here all chars of string is a number, now just check length
        return(ZIP.length()==5);
    }
    //returns true if input String is of type XX-YYYY returns false otherwise
    //X=Letter, Y=Number
    static Boolean validateID(String ID){
        char Current;
        //Check the first 2 chars are letters
        if(ID.length()==7){
            for(int i=0;i<2;i++){
                Current= ID.charAt(i);
                if(!(Character.isAlphabetic(Current)))
                    return false;
            }
            //check that the third char is a '-'
            Current=ID.charAt(2);
            if(Current!='-')
                return false;
            //Check that the last four digits are numbers
            for(int j=3;j<7;j++){
                Current= ID.charAt(j);
                if(!(Character.isDigit(Current)))
                    return false;
            }
            //If the code gets here than we know that the ID is in the right format
            return true;
        }else
            return false;
    }
}
