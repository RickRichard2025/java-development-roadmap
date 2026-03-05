package com.rick.java.fundamentals.exercises;

/**
* Author: Rick_Richards
* @since 5 mar 2026
*/
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
	Scanner SC = new Scanner(System.in);
	Random rand = new Random();

	int attempts = 5;
	int secretNumber = rand.nextInt(50) + 1;

	// Method to start the game
	public void startGame() {
		System.out.println("Welcome to the Number Guessing Game!\n"
				+ "You'll have 5 attempts to guess the right number from 1 to 50");

		while (attempts > 0) {
			System.out.print("Enter your guess: ");

			try {
				// validate if the user's inout isn't a number
				if (!SC.hasNextInt()) {
					System.out.println("❌ Please enter a valid number!");
					SC.next();
					continue;
				}

				int userInput = SC.nextInt();
				attempts--;

				if (userInput == secretNumber) {
					System.out.println("🎉🎉 CONGRATULATIONS!!! YOU GUESSED THE NUMBER");
					SC.close();
					return; // ends the game
				}

				if (attempts > 0) {
					System.out.println("Wrong! Try again. Attempts left: " + attempts);
					if (userInput < secretNumber) {
						System.out.println("The number is higher!");
					} else {
						System.out.println("The number is lower!");
					}
				} else {
					System.out.println("Game Over! The secret number was: " + secretNumber);
				}

			} catch (Exception e) {
				System.out.println("❌ An unexpected error occurred: " + e.getMessage());
				SC.next(); // Clean the buffer
			}
		}

		SC.close();
	}

	public static void main(String[] args) {

		NumberGuessGame guessing = new NumberGuessGame();
		guessing.startGame();

	}

}
