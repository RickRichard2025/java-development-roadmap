package com.rick.java.fundamentals.arrays.and.strings;

/**
 * Author: Rick_Richards
 * 
 * @since 5 mar 2026
 */

/*
 * This class contains a small exercise using strings.
 *
 * The program checks whether a word is a palindrome. A palindrome is a word
 * that reads the same forward and backward (for example: "level" or "radar").
 *
 * I reverse the word and compare it with the original.
 */

public class A06_StringExcercises {

	public static void main(String[] args) {

		String palindrome = "level";

		String reversed = new StringBuilder(palindrome).reverse().toString();

		System.out.println("Original text is: " + palindrome);
		System.out.println("Reverse text is: " + reversed + "\n");

		if (palindrome.equals(reversed)) {
			System.out.println("'" + palindrome + "' is palindrome");
		} else {
			System.out.println("'" + palindrome + "' is not palindrome");
		}

	}

}
