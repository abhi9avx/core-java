package com.company;

import java.util.Random;
import java.util.Scanner;

// Game class to handle logic
class Game {
    private int number;
    private int noOfGuesses;
    private int inputNumber;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Constructor to generate a random number between 1 and 100
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1;
        this.noOfGuesses = 0;
    }

    // Method to take input from the user
    public void takeUserInput() {
        System.out.print("Guess the number (1 to 100): ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    // Method to check if the guessed number is correct
    public boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.println("🎉 Congratulations! You guessed the number correctly.");
            return true;
        } else if (inputNumber < number) {
            System.out.println("🔼 Try a bigger number.");
        } else {
            System.out.println("🔽 Try a smaller number.");
        }
        return false;
    }
}

// Main class
public class PracticeGuessingGame {
    public static void main(String[] args) {
        Game game = new Game();
        boolean isGuessedCorrectly = false;

        // Loop until the user guesses the correct number
        while (!isGuessedCorrectly) {
            game.takeUserInput();
            isGuessedCorrectly = game.isCorrectNumber();
        }

        // Print total attempts
        System.out.println("You took " + game.getNoOfGuesses() + " attempts to guess the number.");
    }
}