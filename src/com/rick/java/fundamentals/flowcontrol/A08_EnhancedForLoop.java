package com.rick.java.fundamentals.flowcontrol;

/**
 * Author: Rick_Richards
 * 
 * @since 26 feb 2026
 */

/*
 * The enhanced for loop (for-each) is used to iterate over arrays or
 * collections.
 *
 * It automatically goes through each element, so you don’t need an index.
 *
 * You cannot control the index directly, and you cannot easily modify elements.
 *
 * It is cleaner and safer for simple iteration.
 */

public class A08_EnhancedForLoop {

	public static void main(String[] args) {

		String[] names = { "Rick", "John", "Maria", "Laura" };

		System.out.println("Printing names:");

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("");
		System.out.println("Iteration complete.");
	}
}

/*
 * for
 * 
 * Best when you know the number of repetitions.
 * 
 * while
 * 
 * Best when repetition depends on a condition.
 * 
 * do-while
 * 
 * Runs at least once, then checks condition.
 * 
 * for-each
 * 
 * Best for iterating arrays/collections cleanly.
 */
