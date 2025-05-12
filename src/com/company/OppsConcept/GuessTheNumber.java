package com.company.OppsConcept;

import java.util.Random;
import java.util.Scanner;

// 📦 Game class encapsulates the "Guess the Number" game logic
class Game {
    private int number;           // 🔢 Random number to be guessed
    private int userInput;        // 🧑‍💻 User input
    private int noOfGuesses = 0;  // 🔁 Guess counter

    // 🧱 Constructor - generates random number from 1 to 100
    public Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1;  // random number between 1-100
    }

    // 🧾 Method to take input from user
    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        userInput = sc.nextInt();
    }

    // 🧪 Method to check if guessed number is correct
    public boolean isCorrectNumber() {
        noOfGuesses++; // increment every time user guesses
        if (userInput == number) {
            System.out.println("🎉 Congratulations! You guessed the correct number in " + noOfGuesses + " attempts.");
            return true;
        } else if (userInput < number) {
            System.out.println("Too low! Try a higher number.");
        } else {
            System.out.println("Too high! Try a lower number.");
        }
        return false;
    }

    // 🔧 Getter for number of guesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // 🔧 Setter for number of guesses (optional, if needed)
    public void setNoOfGuesses(int guesses) {
        this.noOfGuesses = guesses;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game(); // 🎮 Create game instance

        boolean guessedCorrectly = false;

        // 🔁 Keep taking input until the user guesses correctly
        while (!guessedCorrectly) {
            g.takeUserInput();
            guessedCorrectly = g.isCorrectNumber();
        }
    }
}