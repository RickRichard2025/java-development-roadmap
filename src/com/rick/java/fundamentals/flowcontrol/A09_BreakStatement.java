package com.rick.java.fundamentals.flowcontrol;

/**
 * Author: Rick_Richards
 * 
 * @since 26 feb 2026
 */

/*
 * The "break" statement immediately stops a loop or a switch block.
 *
 * When break executes: - The loop ends instantly. - Control moves to the next
 * statement after the loop.
 *
 * It is commonly used to: - Stop a loop early - Exit a switch case
 *
 * Use it carefully. Too many breaks can make logic harder to follow.
 */

public class A09_BreakStatement {

	public static void main(String[] args) {

		System.out.println("Searching for number 5...");

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				System.out.println("Number found: " + i);
				break; // stops the loop immediately
			}

			System.out.println("Checking number: " + i);
		}

		System.out.println("Loop finished.");
	}
}