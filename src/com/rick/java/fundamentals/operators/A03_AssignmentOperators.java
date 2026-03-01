package com.rick.java.fundamentals.operators;

/**
* Author: Rick_Richards
* @since 26 feb 2026
*/

/**
 * A03_AssignmentOperators
 *
 * This class demonstrates how assignment operators work in Java.
 *
 * Assignment operators are used to assign values to variables. Besides the
 * basic "=" operator, Java provides compound assignment operators that combine
 * arithmetic or bitwise operations with assignment.
 *
 * These operators make code shorter and often more readable.
 *
 * Author: Rick Richards
 * 
 * @since 2026-02-26
 */

public class A03_AssignmentOperators {
	public static void main(String[] args) {

		// Basic assignment
		int number = 10;
		System.out.println("Initial value: " + number);

		System.out.println("-----------------------------------");

		// += (add and assign)
		number += 5; // number = number + 5
		System.out.println("After += 5: " + number);

		// -= (subtract and assign)
		number -= 3; // number = number - 3
		System.out.println("After -= 3: " + number);

		// *= (multiply and assign)
		number *= 2; // number = number * 2
		System.out.println("After *= 2: " + number);

		// /= (divide and assign)
		number /= 4; // number = number / 4
		System.out.println("After /= 4: " + number);

		// %= (modulus and assign)
		number %= 3; // number = number % 3
		System.out.println("After %= 3: " + number);

		System.out.println("-----------------------------------");

		// Bitwise assignment operators (basic demonstration)
		int bitExample = 5; // binary: 0101

		bitExample &= 3; // 0101 & 0011 = 0001
		System.out.println("After &= 3: " + bitExample);

		bitExample |= 2; // 0001 | 0010 = 0011
		System.out.println("After |= 2: " + bitExample);

		bitExample ^= 1; // 0011 ^ 0001 = 0010
		System.out.println("After ^= 1: " + bitExample);

		System.out.println("-----------------------------------");

		// Shift assignment operators
		int shiftExample = 8; // binary: 1000

		shiftExample <<= 1; // 1000 -> 10000 (16)
		System.out.println("After <<= 1: " + shiftExample);

		shiftExample >>= 2; // 10000 -> 00100 (4)
		System.out.println("After >>= 2: " + shiftExample);

		shiftExample >>>= 1; // unsigned right shift
		System.out.println("After >>>= 1: " + shiftExample);

	}

}
