package com.rick.java.fundamentals.arrays.and.strings;

/**
 * Author: Rick_Richards
 * 
 * @since 5 mar 2026
 */
/*
 * This example focuses on how to iterate through an array. Two common
 * approaches are demonstrated: 1. A traditional for loop using an index 2. An
 * enhanced for loop (also called a for-each loop)
 *
 * Both methods allow us to access every element stored in the array.
 */
public class A02_ArrayLoop {
	public static void main(String[] args) {
		int[] numbers = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

		System.out.println("Using a traditional 'for' loop and the conditional if-else: ");

		for (int i = 0; i < numbers.length; i++) {
			if (i < numbers.length - 1) {
				System.out.print(numbers[i] + ", ");
			} else {
				System.out.println(numbers[i] + ".\n");
			}

		}

		int j = 0;
		System.out.println("Using an enhanced for loop:");

		for (int num : numbers) {

			if (j < numbers.length - 1) {
				System.out.print(num + ", ");
			} else {
				System.out.println(num + ".\n");
			}
			j++;
		}

	}

}
