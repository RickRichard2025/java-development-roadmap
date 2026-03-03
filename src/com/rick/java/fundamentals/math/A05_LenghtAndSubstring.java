package com.rick.java.fundamentals.math;

public class A05_LenghtAndSubstring {

	// Method to demonstrate length() usage
	public int getStringLength(String input) {
		return input.length();

	}

	// Method to demonstrate substring() usage
	public String getSubstring(String input, int start, int end) {
		return input.substring(start, end);
	}

	public static void main(String[] args) {
		A05_LenghtAndSubstring ls = new A05_LenghtAndSubstring();

		String text = "Hi Everyone, this is Rick";

		// using length method
		int lenght = ls.getStringLength(text);
		System.out.println("lenght of text is: " + lenght);

		// Using substring method
		String part = ls.getSubstring(text, 0, 12);
		System.out.println("Substring from index 7 to 12: " + part);

	}

}
