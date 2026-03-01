package com.rick.java.fundamentals.flowcontrol;

/**
 * Author: Rick_Richards
 * 
 * @since 26 feb 2026
 */

/*
 * The "continue" statement skips the current iteration and jumps to the next
 * one.
 *
 * It does NOT stop the loop. It simply ignores the rest of the code inside the
 * loop for that iteration.
 *
 * Think of it as: "Skip this one, move to the next."
 */

public class A10_ContinueStatement {

	public static void main(String[] args) {

		System.out.println("Printing only odd numbers from 1 to 10:");

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				continue; // skip even numbers
			}

			System.out.println(i);
		}

		System.out.println("Loop completed.");
	}
}
