package com.rick.java.fundamentals.flowcontrol;

/**
 * Author: Rick_Richards
 * 
 * @since 26 feb 2026
 */

/*
 * The "return" statement:
 *
 * 1) Ends the execution of a method immediately. 2) Optionally sends a value
 * back to the caller.
 *
 * Once return runs, nothing after it inside that method will execute.
 *
 * In main(), return simply ends the program.
 */

public class A11_ReturnStatement {

	public static void main(String[] args) {

		System.out.println("Calling method...");

		int result = addNumbers(5, 3);

		System.out.println("Result: " + result);
		System.out.println("Program finished.");

	}

	public static int addNumbers(int a, int b) {

		if (a < 0 || b < 0) {
			System.out.println("Negative numbers are not allowed.");
			return 0; // method ends here
		}

		return a + b; // sends result back
	}
}