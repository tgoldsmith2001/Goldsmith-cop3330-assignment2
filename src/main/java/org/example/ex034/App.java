/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex034;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] names= {"John Smith","Jackie Johnson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        printNames(names);
        String remove= readString(input);
        names=alterString(names,remove);
        printNames(names);
    }
    static void printNames(String[] names){
        System.out.println("There are "+names.length+" employees: ");
        for(String name: names){
            System.out.println(name);
        }
    }
    static String readString(Scanner input){
        System.out.printf("\nPick a name to remove: ");
        return input.nextLine();
    }
    static String[] alterString(String[] origArr, String removeStr){
        String[] newArr;
        Boolean located=false;
        for (int i = 0; i < origArr.length; i++) {
            if(origArr[i].equals(removeStr))
                located=true;
        }
        if(located==true) {
            int newLength=origArr.length - 1;
            newArr = new String[newLength];
        }else {
            System.out.println("Sorry that name is not in the list");
            return origArr;
        }
        int index=0;
        for (int j = 0; j < origArr.length; j++) {
            if(!(origArr[j].equals(removeStr))) {
                newArr[index] = origArr[j];
                index++;
            }
        }
        return newArr;
    }
}
