package com.rick.java.fundamentals.flowcontrol;

/**
 * Author: Rick_Richards
 * 
 * @since 26 feb 2026
 */

/*
 * A nested loop is a loop inside another loop.
 *
 * For every iteration of the outer loop, the inner loop runs completely.
 *
 * Think of it like this:
 *
 * Outer loop controls rows. Inner loop controls columns.
 *
 * Nested loops are commonly used for: - Matrices - Patterns - Multiplication
 * tables
 */

public class A13_NestedLoops {

	public static void main(String[] args) {

		System.out.println("Multiplication Table (1 to 5):");

		for (int i = 1; i <= 5; i++) { // outer loop

			for (int j = 1; j <= 5; j++) { // inner loop
				System.out.print(i * j + "\t");
			}

			System.out.println(); // move to next row
		}

		System.out.println("Nested loops completed.");
	}
}