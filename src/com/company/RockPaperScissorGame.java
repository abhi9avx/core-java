package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        // 0 -> Rock
        // 1 -> Paper
        // 2 -> Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors:");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3); // 0 to 2

        // Show both choices
        System.out.println("You chose: " + userInput);
        System.out.println("Computer chose: " + computerInput);

        if (userInput == computerInput) {
            System.out.println("Match Draw!");
        } else {
            if (userInput == 0) { // User: Rock
                if (computerInput == 1) {
                    System.out.println("Computer Wins! Paper beats Rock.");
                } else if (computerInput == 2) {
                    System.out.println("You Win! Rock beats Scissors.");
                }
            } else if (userInput == 1) { // User: Paper
                if (computerInput == 0) {
                    System.out.println("You Win! Paper beats Rock.");
                } else if (computerInput == 2) {
                    System.out.println("Computer Wins! Scissors beat Paper.");
                }
            } else if (userInput == 2) { // User: Scissors
                if (computerInput == 0) {
                    System.out.println("Computer Wins! Rock beats Scissors.");
                } else if (computerInput == 1) {
                    System.out.println("You Win! Scissors beat Paper.");
                }
            } else {
                System.out.println("Invalid Input! Please enter 0, 1, or 2.");
            }
        }

        sc.close();
    }
}