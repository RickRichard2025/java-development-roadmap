package com.rick.java.fundamentals.math;

/**
* Author: Rick_Richards
* @since 3 mar 2026
*/

/**
 * Class: A04_CastingAndNarrowing
 * 
 * This class demonstrates the concept of casting and narrowing in Java. -
 * Casting (Widening / Upcasting) is when a smaller type is converted to a
 * larger type automatically. - Narrowing (Downcasting) is when a larger type is
 * converted to a smaller type manually, potentially losing data.
 * 
 */

public class A04_CastingAndNarrowing {
	// 1️⃣ Widening Casting (Automatic) - smaller to larger type
	public void wideningExample() {
		int intValue = 100;
		double doubleValue = intValue; // automatic conversion
		System.out.println("Widening Example: int " + intValue + " -> double " + doubleValue);
	}

	// 2️⃣ Narrowing Casting (Manual) - larger to smaller type
	public void narrowingExample() {
		double doubleValue = 123.456;
		int intValue = (int) doubleValue; // manual conversion, decimal truncated
		System.out.println("Narrowing Example: double " + doubleValue + " -> int " + intValue);
	}

	// 3️⃣ Potential data loss with narrowing
	public void narrowingDataLoss() {
		long longValue = 130L;
		byte byteValue = (byte) longValue; // overflow occurs because byte max is 127
		System.out.println("Narrowing Data Loss: long " + longValue + " -> byte " + byteValue);
	}

	// 4️⃣ Widening and narrowing with arithmetic
	public void arithmeticCasting() {
		int a = 10;
		int b = 3;

		// automatic widening in division
		double result = (double) a / b; // manually cast one operand to double to get precise division
		System.out.println("Arithmetic Casting: " + a + " / " + b + " = " + result);
	}

	public static void main(String[] args) {
		A04_CastingAndNarrowing demo = new A04_CastingAndNarrowing();

		System.out.println("=== Widening Casting Example ===");
		demo.wideningExample();

		System.out.println("\n=== Narrowing Casting Example ===");
		demo.narrowingExample();

		System.out.println("\n=== Narrowing Data Loss Example ===");
		demo.narrowingDataLoss();

		System.out.println("\n=== Arithmetic Casting Example ===");
		demo.arithmeticCasting();
	}

}
