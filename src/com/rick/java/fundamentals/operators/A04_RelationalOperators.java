package com.rick.java.fundamentals.operators;

/**
* Author: Rick_Richards
* @since 26 feb 2026
*/

/**
 * A04_RelationalOperators
 *
 * In this class we will see relational (comparison) operators in Java.
 *
 * Relational operators are used to compare two values. The result of a
 * relational expression is always a boolean: either true or false.
 *
 * These operators are commonly used in conditional statements like if, while,
 * and for loops.
 *
 * Author: Rick Richards
 * 
 * @since 2026-02-26
 */

public class A04_RelationalOperators {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// Equal to
		System.out.println("a == b: " + (a == b));

		// Not equal to
		System.out.println("a != b: " + (a != b));

		// Greater than
		System.out.println("a > b: " + (a > b));

		// Less than
		System.out.println("a < b: " + (a < b));

		// Greater than or equal to
		System.out.println("a >= b: " + (a >= b));

		// Less than or equal to
		System.out.println("a <= b: " + (a <= b));

		System.out.println("-----------------------------------");

		// Example inside a conditional statement
		if (a < b) {
			System.out.println("a is smaller than b");
		}

		// Important: comparing primitive values vs objects
		int x = 5;
		int y = 5;

		System.out.println("x == y (primitive comparison): " + (x == y));
	}

}
