/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex030;
public class App {
    public static void main(String[] args) {
        printTable(makeTable(12,12),12,12);
        }
    public static int[][] makeTable(int width, int height){
        int[][]table= new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                table[i][j]=(i+1)*(j+1);
            }
        }
        return table;
    }
    static void printTable(int[][]table,int width, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("%-5d",table[i][j]);
            }
            System.out.println();
        }
    }
}
