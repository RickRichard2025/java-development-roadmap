package com.rick.java.fundamentals.flowcontrol;

/**
* Author: Rick_Richards
* @since 26 feb 2026
*/

import java.util.Scanner;

/*
 * The "while" loop runs as long as a condition is true.
 *
 * It checks the condition BEFORE executing the block.
 *
 * If the condition is false from the beginning,
 * the loop will never run.
 *
 * Use it when the number of iterations
 * depends on a condition, not a fixed count.
 */

public class A06_WhileLoop {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		int number;

		System.out.println("Enter numbers. Type 0 to stop:");

		number = SC.nextInt();

		while (number != 0) {
			System.out.println("You entered: " + number);
			number = SC.nextInt();
		}

		System.out.println("Loop ended.");
		SC.close();
	}
}
