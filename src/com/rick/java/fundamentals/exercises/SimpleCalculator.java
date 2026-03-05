package com.rick.java.fundamentals.exercises;

/**
* Author: Rick_Richards
* @since 5 mar 2026
*/
/*
This small program simulates a basic calculator.

The user enters two numbers and chooses an operation.
The program then performs the calculation and prints the result.

It combines several concepts learned earlier such as
Scanner input, conditional statements, and arithmetic operators.
*/
import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

		int numberOne, numberTwo;
		double result = 0;
		char operator;

		System.out.println("Calculator: ");

		// FIRST NUMBER
		while (true) {
			System.out.print("Enter first number: ");
			if (SC.hasNextInt()) {
				numberOne = SC.nextInt();
				SC.nextLine(); // Clean de buffer
				break;
			}
			System.out.println("❌ Invalid frist number. Try again.");
			SC.nextLine();
		}

		// SECOND NUMBER
		while (true) {
			System.out.print("Enter second number: ");
			if (SC.hasNextInt()) {
				numberTwo = SC.nextInt();
				break;
			}
			System.out.println("❌ Invalid second  number. Try again.");
			SC.nextLine();
		}

		while (true) {
			System.out.print("Choose your math operation (+, -, *, /): ");
			operator = SC.next().charAt(0);
			if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
				break;
			}
			System.out.println("❌ Invalid operator. Try again.");

		}

		switch (operator) {
		case '+':
			result = numberOne + numberTwo;
			break;

		case '-':
			result = numberOne - numberTwo;
			break;
		case '*':
			result = numberOne * numberTwo;
			break;
		case '/':
			if (numberTwo == 0) {
				System.out.println("Cannot divide by zero");

			}
			result = (double) numberOne / numberTwo;
			break;

		default:
			System.out.println("Invalid Option!");
			break;
		}

		SC.close();

		System.out.println("Result " + result);
	}

}
