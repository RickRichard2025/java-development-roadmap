package com.rick.java.fundamentals.arrays.and.strings;

/**
 * Author: Rick_Richards
 * 
 * @since 5 mar 2026
 */

/*
 * This class shows the very basics of arrays in Java.
 *
 * Here we create an array, access some elements using their index, and print
 * the length of the array.
 *
 * The goal is simply to understand how arrays store multiple values of the same
 * type and how we can retrieve them.
 */

public class A01_ArrayBasics {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		// Accessing elements by their position (index starts at 0)
		System.out.println("First element: " + numbers[0]);
		System.out.println("Third element: " + numbers[2]);

		// Printing how many elements the array contains
		System.out.println("Array length: " + numbers.length);
	}

}
