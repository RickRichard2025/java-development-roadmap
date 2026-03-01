package com.rick.java.fundamentals.flowcontrol;

/**
* Author: Rick_Richards
* @since 26 feb 2026
*/

import java.util.Scanner;

/*
 * The "do-while" loop is similar to while,
 * but with one key difference:
 *
 * It executes the block FIRST,
 * then checks the condition.
 *
 * This guarantees the loop runs at least once.
 *
 * Use it when you need the user to
 * execute something before validation.
 */

public class A07_DoWhileLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int option;

		do {
			System.out.println("Menu:");
			System.out.println("1. Say Hello");
			System.out.println("0. Exit");
			System.out.print("Choose an option: ");

			option = scanner.nextInt();

			if (option == 1) {
				System.out.println("Hello!\n");
			}

		} while (option != 0);

		System.out.println("Program terminated.");
		scanner.close();
	}
}
