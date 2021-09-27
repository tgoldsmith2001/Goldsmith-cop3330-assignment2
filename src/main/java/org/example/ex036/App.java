/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex036;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Integer[] values={};
        while(true) {
            int R = getInt(input);
            if(R==-1)
                break;
            values=addtoArr(values, R);
        }
        System.out.printf("Numbers: ");
        for (int num: values) {
            System.out.printf(num+", ");
        }
        System.out.println(output(average(values),min(values),max(values),std(values)));
    }
    static String output(double ave, double min, double max, double std){
        return "\nThe average is "+ave+"\nThe minimum is "+min+"" +
                "\nThe maximum is "+max+"\nThe standard deviation is "+std;
    }
    static double std(Integer[] values){
        double ave=average(values);
        double sum=0;
        for (int num: values) {
            sum+=Math.pow(ave-(double)num,2);
        }
        return Math.round(Math.sqrt(sum/values.length)*100.0)/100.0;
    }
    static int max(Integer[] values){
        int max=values[0];
        for (int num: values) {
            if(num>max)
                max=num;
        }
        return max;
    }
    static int min(Integer[] values){
        int min=values[0];
        for (int num: values) {
            if(num<min)
                min=num;
        }
        return min;
    }
    static double average(Integer[] values){
        int sum=0;
        for (int num: values) {
            sum+=num;
        }
        return Math.round((double)sum/(double)(values.length)*100.0)/100.0;
    }
    static int getInt(Scanner input){
        int R;
        String RStr;
        while(true){
            try{
                System.out.printf("Enter a number: ");
                RStr=input.nextLine();
                if(RStr.equals("done"))
                    return -1;
                R=Integer.parseInt(RStr);
            }catch (Exception E){
                System.out.println("Sorry that is not a valid input. ");
                continue;
            }
            break;
        }
        return R;
    }
    static Integer[] addtoArr(Integer[] orig, int addElement){
        Integer[] newArr= new Integer[orig.length+1];
        for (int i = 0; i < orig.length; i++) {
            newArr[i]=orig[i];
        }
        newArr[orig.length]=addElement;
        return newArr;
    }
}
