package com.rick.java.fundamentals.flowcontrol;

/**
* Author: Rick_Richards
* @since 26 feb 2026
*/

import java.util.Scanner;

/*
 * The "switch" statement is used when you need
 * to compare one variable against multiple fixed values.
 *
 * It works best with:
 * - int
 * - char
 * - String
 * - enum
 *
 * Important:
 * - Each case should end with "break" to avoid fall-through.
 * - The default case runs if no case matches.
 *
 * Switch is cleaner than multiple else-if blocks
 * when checking the same variable.
 */

public class A04_SwitchStatement {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);

		System.out.print("Enter a day of the week (1-7): ");
		int day = SC.nextInt();

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Sturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Invalid option");
		}

		SC.close();
	}
}