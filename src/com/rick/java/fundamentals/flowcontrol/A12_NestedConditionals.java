package com.rick.java.fundamentals.flowcontrol;

/**
* Author: Rick_Richards
* @since 26 feb 2026
*/

import java.util.Scanner;

/*
 * A nested conditional means placing one if statement
 * inside another if statement.
 *
 * This is useful when a second decision
 * depends on a first condition being true.
 *
 * Structure example:
 *
 * if (condition1) {
 *     if (condition2) {
 *         // logic
 *     }
 * }
 *
 * Important:
 * Nesting increases complexity.
 * If it gets too deep, readability suffers.
 */

public class A12_NestedConditionals {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		if (age >= 18) {

			System.out.println("You are an adult.");

			System.out.print("Do you have a driver's license? (true/false): ");
			boolean hasLicense = scanner.nextBoolean();

			if (hasLicense) {
				System.out.println("You are allowed to drive.");
			} else {
				System.out.println("You are an adult but cannot drive legally.");
			}

		} else {
			System.out.println("You are a minor.");
		}

		scanner.close();
	}
}