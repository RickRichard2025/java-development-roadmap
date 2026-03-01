package com.rick.java.fundamentals.operators;

/**
 * Author: Rick_Richards
 * 
 * @since 26 feb 2026
 */

/*
 * The ternary operator is a compact way to write simple conditional logic.
 *
 * Instead of writing a full if-else statement, we can evaluate a condition and
 * return one value if it's true, and another if it's false.
 *
 * Syntax: condition ? valueIfTrue : valueIfFalse;
 *
 * It is called "ternary" because it uses three parts: 1) The condition 2) The
 * result if true 3) The result if false
 *
 * It is best used for simple decisions. If the logic becomes complex, a regular
 * if-else block is clearer.
 */

public class A08_TernaryOperators {
	public static void main(String[] args) {
		int age = 20;

		// Basic example
		String message = (age >= 18) ? "You are an adult." : "You are a minor.";
		System.out.println(message);

		System.out.println("-----------------------------------");

		// Numeric example
		int a = 10;
		int b = 25;

		int max = (a > b) ? a : b;
		System.out.println("The greater number is: " + max);

		System.out.println("-----------------------------------");

		// Using ternary directly inside print
		System.out.println((a % 2 == 0) ? "a is even." : "a is odd.");

		System.out.println("-----------------------------------");

		// Nested ternary (use carefully)
		int score = 85;

		String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "Fail";

		System.out.println("Final grade: " + grade);
	}

}
