package com.rick.java.fundamentals;

/**
 * Author: Rick_Richards
 * 
 * @since 26 feb 2026
 */

/**
 * A03_Variables
 *
 * In this class, we explore Java primitive data types and their minimum and
 * maximum values.
 *
 * Instead of guessing numeric limits, Java provides built-in wrapper classes
 * (Byte, Short, Integer, etc.) that expose constants like MIN_VALUE and
 * MAX_VALUE.
 *
 * This example helps reinforce: - How primitive types store data - The size
 * differences between numeric types - Basic variable declaration and
 * initialization - Simple console output
 *
 * Author: Rick Richards
 * 
 * @since 2026-02-26
 */
public class A03_Variables {
	/**
	 * Entry point of the program. Demonstrates numeric ranges and basic variable
	 * usage.
	 *
	 * @param args Command-line arguments (not used)
	 */
	public static void main(String[] args) {
		// Welcome to variable class
		// in this lesson we will learn the max and min for each variable in java:

		// byte

		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;

		System.out.println("The minimum value of byte is: " + minByte);
		System.out.println("The maximum value of byte is: " + maxByte);

		// short
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		System.out.println("Maximun of Short is " + maxShort);
		System.out.println("Minimun of Short is " + minShort);

		// int Overflow
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		int overflowExample = Integer.MAX_VALUE + 1;
		System.out.println("Overflow example: " + overflowExample);
		System.out.println("Maximun of int is " + maxInt);
		System.out.println("Minimun of int is " + minInt);

		// long
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		System.out.println("Maximun of Long is " + maxLong);
		System.out.println("Minimun of Long is " + minLong);

		// float
		float maxF = Float.MAX_VALUE;
		float minF = Float.MIN_VALUE;
		System.out.println("Maximun of Float is " + maxF);
		System.out.println("Minimun of Float is " + minF);

		// double
		double maxD = Double.MAX_VALUE;
		double minD = Double.MIN_VALUE;
		System.out.println("Maximun of Double is " + maxD);
		System.out.println("Minimun of Double is " + minD);

		// char
		char letra = 'A';
		System.out.println("The value assisgned to the variable char is the letter: " + letra);

		// boolean
		boolean esVerdadero = true;
		if (2 >= 1) {
			System.out.println("2 is bigger tan 1 " + esVerdadero);
		}

		// String (not primitive, but widely used)
		String name = "Rick";
		System.out.println(name);

		System.exit(0);

	}

}
