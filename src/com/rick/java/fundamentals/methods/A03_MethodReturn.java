package com.rick.java.fundamentals.methods;

/**
 * Author: Rick_Richards
 * 
 * @since 3 mar 2026
 */

/*
 * A03_Methods return values This class explains how methods can send values
 * nack using return
 */

public class A03_MethodReturn {

	/*
	 * I am going to calculate the area of a rectangle and then return the result to
	 * the caller
	 */

	public double area(double width, double height) {
		return width * height;
	}

	/*
	 * Checking if a number is positive Returns true or false
	 */
	public boolean isPossitive(int number) {
		return number > 0;
	}

	public static void main(String[] args) {
		A03_MethodReturn mr = new A03_MethodReturn();

		double area = mr.area(12, 5);
		System.out.println("the area of your rectangle is: " + area);

		System.out.println("Is possitive? " + mr.isPossitive(73));
	}

}