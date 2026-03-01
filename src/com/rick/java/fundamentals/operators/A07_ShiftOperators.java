package com.rick.java.fundamentals.operators;

/**
 * Author: Rick_Richards
 * 
 * @since 26 feb 2026
 */

/*
 * Shift operators move bits to the left or to the right.
 *
 * Since integers are stored in binary form, shifting changes the actual numeric
 * value by repositioning the bits.
 *
 * Operators covered here:
 *
 * << Left shift >> Signed right shift >>> Unsigned right shift
 *
 * In simple terms: - Left shift usually multiplies a number by 2. - Right shift
 * usually divides a number by 2. - Unsigned right shift ignores the sign bit.
 *
 * Understanding shift operators makes binary math much clearer.
 */

public class A07_ShiftOperators {
	public static void main(String[] args) {

		int number = 8; // binary: 00001000

		// Left shift (<<)
		int leftShift = number << 1; // shifts bits left by 1 position
		System.out.println("8 << 1: " + leftShift);

		leftShift = number << 2;
		System.out.println("8 << 2: " + leftShift);

		System.out.println("-----------------------------------");

		// Signed right shift (>>)
		int rightShift = number >> 1;
		System.out.println("8 >> 1: " + rightShift);

		rightShift = number >> 2;
		System.out.println("8 >> 2: " + rightShift);

		System.out.println("-----------------------------------");

		// Working with negative numbers
		int negative = -8;
		System.out.println("Original negative value: " + negative);

		int signedRightShift = negative >> 1;
		System.out.println("-8 >> 1 (signed): " + signedRightShift);

		int unsignedRightShift = negative >>> 1;
		System.out.println("-8 >>> 1 (unsigned): " + unsignedRightShift);

		System.out.println("-----------------------------------");

		// Visual explanation (conceptual)
		System.out.println("Left shift generally multiplies by 2.");
		System.out.println("Right shift generally divides by 2 (for positive numbers).");
	}

}
