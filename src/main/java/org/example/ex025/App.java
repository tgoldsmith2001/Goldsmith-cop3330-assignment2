/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex025;
import java.util.Scanner;

public class App {
    /*Note the restrictions of the problem don't extend all cases so in the following cases I print INVALID:
        -A password that is only special characters and is less than 8 characters
        -A password with letters and numbers that is less than 8 characters EX t123456
        -A password with only letters/only numbers/only special characters that is grater than 8 characters
     */
    public static void main(String[] args) {
        String password;
        Scanner input= new Scanner(System.in);
        System.out.printf("Enter a Password: ");
        password=readString(input);
        String passStatus="INVALID";
        switch(passwordValidator(password)){
            case 0:
                passStatus="Very Weak";
                break;
            case 1:
                passStatus="Weak";
                break;
            case 2:
                passStatus="Strong";
                break;
            case 3:
                passStatus="Very Strong";
                break;
        }
        System.out.format("The password '%s' is a %s password",password,passStatus);
    }
    static String readString(Scanner input){
        return input.nextLine();
    }
    static Integer passwordValidator(String password){
        if(password.length()<8){
            if(hasNumber(password)==true&hasLetter(password)==false)
                return 0;
            if(hasLetter(password)==true&hasNumber(password)==false)
                return 1;
        }else if(password.length()>=8){
            if(hasLetter(password)==true&hasNumber(password)==true&hasSpecial(password)==false)
                return 2;
            if(hasLetter(password)==true&hasNumber(password)==true&hasSpecial(password)==true)
                return 3;
        }
        return -1;
    }
    static Boolean hasNumber(String password){
        boolean hasNum=false;
        for(char c : password.toCharArray()){
            if(Character.isDigit(c))
                hasNum=true;
            else if(hasNum==true)
                break;
        }
        return hasNum;
    }
    static Boolean hasLetter(String password){
        boolean hasLetter=false;
        for(char c : password.toCharArray()){
            if(Character.isAlphabetic(c))
                hasLetter=true;
            else if(hasLetter==true)
                break;
        }
        return hasLetter;
    }
    static Boolean hasSpecial(String password){
        boolean hasSpecial=false;
        for(char c : password.toCharArray()){
            if(password.valueOf(c).matches("[^a-zA-Z0-9]"))
                hasSpecial=true;
            else if(hasSpecial==true)
                break;
        }
        return hasSpecial;
    }
}
