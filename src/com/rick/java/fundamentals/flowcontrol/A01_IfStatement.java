package com.rick.java.fundamentals.flowcontrol;

import java.util.InputMismatchException;
/**
* Author: Rick_Richards
* @since 26 feb 2026
*/
import java.util.Scanner;
/*
 * The "if" statement is the most basic decision-making structure in Java.
 *
 * It executes a block of code ONLY if a condition evaluates to true. If the
 * condition is false, nothing happens.
 *
 * Think of it as: "If this is true, then do this."
 *
 * No alternative path. Just one decision.
 */

public class A01_IfStatement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your age: ");

		// Here we have impleted the try-catch exception, and we will see more
		// exceptions in java later
		try {
			int age = scanner.nextInt();

			if (age >= 18) {
				System.out.println("You are an adult.");
			}
		} catch (InputMismatchException ERROR) {
			System.out.println("Invalid entry, close and re-open it again (Please enter numbers only)");
		} finally {
			System.out.println("Program finished.");
		}

		scanner.close();
	}
}