package com.rick.java.fundamentals.operators;

/**
 * Author: Rick_Richards
 * 
 * @since 26 feb 2026
 */
/*
 * Logical operators allow us to combine multiple conditions into a single
 * expression.
 *
 * Instead of checking one comparison at a time, we can ask:
 * "Is this true AND that true?" "Is this true OR that true?"
 * "Is this NOT true?"
 *
 * These operators are heavily used in real-world logic, especially inside if
 * statements, loops, and validation rules.
 *
 * Operators covered here:
 *
 * && Logical AND -> true only if both conditions are true || Logical OR -> true
 * if at least one condition is true ! Logical NOT -> reverses a boolean value
 *
 * If relational operators answer a single question, logical operators connect
 * multiple questions together.
 */
public class A05_LogicalOperators {
	public static void main(String[] args) {
		int age = 25;
		boolean hasLicense = true;

		// Logical AND (&&)
		if (age >= 18 && hasLicense) {
			System.out.println("You are allowed to drive.");
		}

		// Logical OR (||)
		boolean isWeekend = false;
		boolean isHoliday = true;

		if (isWeekend || isHoliday) {
			System.out.println("You can relax today.");
		}

		// Logical NOT (!)
		boolean isRaining = false;

		if (!isRaining) {
			System.out.println("You can go outside.");
		}

		System.out.println("-----------------------------------");

		// Combining multiple logical operators
		int score = 85;
		boolean passedExam = score >= 60;
		boolean excellentScore = score >= 90;

		if (passedExam && !excellentScore) {
			System.out.println("You passed, but there is room to improve.");
		}

		System.out.println("-----------------------------------");

		// Short-circuit behavior demonstration
		int x = 10;
		if (x > 5 && x++ > 10) {
			System.out.println("This will not print.");
		}

		System.out.println("Value of x after short-circuit check: " + x);

	}

}
