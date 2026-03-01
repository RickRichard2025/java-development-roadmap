package com.rick.java.fundamentals.operators;

/**
 * Author: Rick_Richards
 * 
 * @since 26 feb 2026
 */

/**
 * A02_ArithmeticOperators
 *
 * This class demonstrates all arithmetic operators available in Java.
 *
 * Arithmetic operators are used to perform basic mathematical operations such
 * as addition, subtraction, multiplication, division, and remainder. It also
 * includes increment and decrement operators.
 *
 * The goal of this class is to understand how Java evaluates expressions and
 * how numeric operations behave at runtime.
 *
 * Author: Rick Richards
 * 
 * @since 2026-02-26
 */

public class A02_Arithmetic_Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;

		System.out.println("Welcome to Operators:");
		// Addition
		int addition = a + b;
		System.out.println("Addition (a + b): " + addition);

		// Subtraction
		int subtraction = a - b;
		System.out.println("Subtraction (a - b): " + subtraction);

		// Multiplication
		int multiplication = a * b;
		System.out.println("Multiplication (a * b): " + multiplication);

		// Division (integer division)
		int division = a / b;
		System.out.println("Division (a / b): " + division);

		// Modulus (remainder of division)
		int modulus = a % b;
		System.out.println("Modulus (a % b): " + modulus);

		System.out.println("-----------------------------------");

		// Increment operator
		int incrementExample = 5;
		incrementExample++;
		System.out.println("Increment (5++): " + incrementExample);

		// Decrement operator
		int decrementExample = 5;
		decrementExample--;
		System.out.println("Decrement (5--): " + decrementExample);

		System.out.println("-----------------------------------");

		// Prefix increment
		int x = 5;
		int prefix = ++x; // x is incremented first
		System.out.println("Prefix (++x): " + prefix);

		// Postfix increment
		int y = 5;
		int postfix = y++; // y is incremented after assignment
		System.out.println("Postfix (y++): " + postfix);
		System.out.println("Value of y after postfix: " + y);

		System.out.println("-----------------------------------");

		// Important note about division with double
		double preciseDivision = 10.0 / 3;
		System.out.println("Division with double (10.0 / 3): " + preciseDivision);

	}

}
