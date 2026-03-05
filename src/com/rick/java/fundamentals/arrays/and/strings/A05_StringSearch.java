package com.rick.java.fundamentals.arrays.and.strings;

/**
 * Author: Rick_Richards
 * 
 * @since 5 mar 2026
 */
/*
 * This example shows a few ways to search and extract information from a
 * string.
 *
 * We check if a word exists inside a sentence, find the position of a word, and
 * extract a part of the string using substring.
 */

public class A05_StringSearch {
	public static void main(String[] args) {

		String sentence = "Java is one of the best and powerful language";

		System.out.println("Contains 'java': " + sentence.contains("Java")); // true and It's case sensitive

		System.out.println("Index of 'powerful': " + sentence.indexOf("powerful"));

		String part = sentence.substring(0, 4);
		System.out.println("part of original text: " + part);
	}

}
