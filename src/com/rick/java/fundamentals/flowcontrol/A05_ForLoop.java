package com.rick.java.fundamentals.flowcontrol;

/**
 * Author: Rick_Richards
 * 
 * @since 26 feb 2026
 */

/*
 * The "for" loop is used when you know exactly how many times you want to
 * repeat something.
 *
 * It has three parts:
 *
 * 1) Initialization → where the counter starts 2) Condition → when the loop
 * should stop 3) Update → how the counter changes
 *
 * It’s compact and very common for counting loops.
 */

public class A05_ForLoop {

	public static void main(String[] args) {

		System.out.println("Counting from 1 to 5:");

		// In this example we will print from 1 to 5 only
		for (int i = 1; i <= 5; i++) {
			System.out.println("Value of i: " + i);
		}

		System.out.println("Loop finished.");
	}
}
