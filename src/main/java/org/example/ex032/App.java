/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex032;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int difficulty;
        Boolean gameActive=true;
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!\n");
        while(gameActive) {
            difficulty= readDifficulty(input);
            runGame(difficulty, input);
            gameActive=playAgain(input);
        }
    }
    static int readDifficulty(Scanner input){
        String S;
        int difficulty;
        while (true) {
            try {
                System.out.printf("Choose the difficulty level(1,2,or 3): ");
                S = input.next();
                difficulty = Integer.parseInt(S);
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                continue;
            }if (difficulty != 1 & difficulty != 2 & difficulty != 3) {
                System.out.println("Enter either 0, 1, or 2");
                continue;
            }
            break;
        }
        return difficulty;
    }
    static Boolean playAgain(Scanner input){
        while(true) {
            String S;
            System.out.printf("\nDo you want to play again(Y/N)");
            S = input.next();
            S = S.toLowerCase(Locale.ROOT);
            if (!(S.equals("y") | S.equals("n"))) {
                System.out.printf("Invalid selection try again: ");
            }else {
                if (S.equals("n")) {
                    System.out.println("Thank you for playing!");
                    return false;
                }else
                    return true;
            }
        }
    }
    static void runGame(int difficulty, Scanner input){
        String S;
        int guess;
        int number=getRandom(difficulty);
        System.out.printf("I have my number. What's your guess? ");
        int num_guesses = 1;
        while (true) {
            try {
                S = input.next();
                guess = Integer.parseInt(S);
            } catch (Exception e) {
                System.out.printf("Invalid input, try again");
                num_guesses++;
                continue;
            }if (guess < number) {
                System.out.printf("Too Low. Guess again: ");
                num_guesses++;
                continue;
            }if (guess > number) {
                System.out.printf("Too High. Guess again: ");
                num_guesses++;
                continue;
            }
            break;
        }
        System.out.println("You got it in " + num_guesses + " guesses");
    }

    static int getRandom(int difficulty){
        int number=-1;
        switch (difficulty) {
            case 1:
                number = (int) Math.round((Math.random() * 9) + 1);
                break;
            case 2:
                number = (int) Math.round((Math.random() * 99) + 1);
                break;
            case 3:
                number = (int) Math.round((Math.random() * 999) + 1);
                break;
        }
        return number;
    }
}
