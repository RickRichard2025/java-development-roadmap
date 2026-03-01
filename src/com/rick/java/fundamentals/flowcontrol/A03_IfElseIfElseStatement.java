package com.rick.java.fundamentals.flowcontrol;

/**
* Author: Rick_Richards
* @since 26 feb 2026
*/

import java.util.Scanner;

/*
 * The "if-else if-else" structure is used when
 * you have multiple possible conditions.
 *
 * The program checks conditions from top to bottom.
 * The FIRST true condition gets executed.
 *
 * Once a condition is true, the rest are skipped.
 *
 * Order matters here.
 */

public class A03_IfElseIfElseStatement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your exam score (0-100): ");
		int score = scanner.nextInt();

		if (score >= 90) {
			System.out.println("Grade: A");
		} else if (score >= 80) {
			System.out.println("Grade: B");
		} else if (score >= 70) {
			System.out.println("Grade: C");
		} else if (score >= 60) {
			System.out.println("Grade: D");
		} else {
			System.out.println("Grade: F");
		}

		scanner.close();
	}
}