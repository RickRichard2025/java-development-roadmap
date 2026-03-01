package com.rick.java.fundamentals.flowcontrol;

/**
* Author: Rick_Richards
* @since 26 feb 2026
*/

import java.util.Scanner;

/*
 * The "if-else" statement gives you two possible paths.
 *
 * If the condition is true → the first block runs.
 * If the condition is false → the else block runs.
 *
 * Now the program MUST choose one direction.
 *
 * This is your first real branching structure.
 */

public class A02_IfElseStatement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println("The number is even.");
		} else {
			System.out.println("The number is odd.");
		}

		scanner.close();
	}
}