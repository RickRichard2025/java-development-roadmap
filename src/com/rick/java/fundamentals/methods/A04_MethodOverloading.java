package com.rick.java.fundamentals.methods;

/**
 * Author: Rick_Richards
 * 
 * @since 3 mar 2026
 */

/*
 * In here I am going to demonstrate method overloading in Java.
 * 
 * Method overloading occurs when multiple methods share the same name but have
 * different parameter lists.
 * 
 * Purpose: Understand compile-time polymorphism.
 */

public class A04_MethodOverloading {

	/**
	 * Multiplies two integers.
	 *
	 * @param a First integer value.
	 * @param b Second integer value.
	 * @return The multiplication result.
	 */
	public int multiply(int a, int b) {
		return a * b;

	}

	/**
	 * Multiplies two double values.
	 *
	 * @param a First double value.
	 * @param b Second double value.
	 * @return The multiplication result.
	 */

	public double multiply(double a, double b) {
		return a * b;
	}

	/**
	 * Multiplies three integers.
	 *
	 * @param a First integer value.
	 * @param b Second integer value.
	 * @param c Third integer value.
	 * @return The multiplication result.
	 */
	public int multiplyTwo(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String[] args) {
		A04_MethodOverloading mo = new A04_MethodOverloading();

		System.out.println("Integer result is: " + mo.multiply(12, 12));
		System.out.println("Double result is: " + mo.multiply(10.5, 10.5));
		System.out.println("Integer result is: " + mo.multiplyTwo(2, 4, 6));
	}

}
