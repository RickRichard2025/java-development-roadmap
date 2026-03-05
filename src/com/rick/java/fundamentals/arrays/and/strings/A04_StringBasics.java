package com.rick.java.fundamentals.arrays.and.strings;

/**
* Author: Rick_Richards
* @since 5 mar 2026
*/

/*
 * This class introduces some basic operations with Java strings.
 *
 * We look at a few commonly used methods such as:
 * - Getting the length of a string
 * - Accessing a character by its position
 * - Converting text to uppercase or lowercase
 *
 * These operations are part of everyday string manipulation in Java.
 */

//Eeven if we have had reviewed String in the previous class A03_Variables this is a more detailed class
import java.util.Scanner;

public class A04_StringBasics {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

		// Free text for user input
		System.out.println("Enter your free text: ");
		String freeText = SC.nextLine();

		System.out.println("Length: " + freeText.length());
		System.out.println("First character is: " + freeText.charAt(0));

		System.out.println("UpperCase: " + freeText.toUpperCase());
		System.out.println("LowerCase: " + freeText.toLowerCase());

		SC.close();

	}

}
