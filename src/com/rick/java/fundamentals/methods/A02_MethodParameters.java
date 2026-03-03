package com.rick.java.fundamentals.methods;

/**
 * Author: Rick_Richards
 * 
 * @since 3 mar 2026
 */

/*
 * A02_MethodParameters In trhis class I will explain you how methods receive
 * data using parameters Parameters act like input that methods use to perform
 * operations
 */

public class A02_MethodParameters {

	/*
	 * This method receives 2 numbers and will print their multiplication Parameters
	 * allow methods to work with dynamic values
	 */
	public void addNumber(int numOne, int numTwo) {
		int result = numOne * numTwo;
		System.out.println("Multiplication is: " + result);
	}

	/*
	 * This method prints a custom message
	 */
	public void printMessage(String message) {
		System.out.println("Message: " + message);
	}

	public static void main(String[] args) {
		A02_MethodParameters mp = new A02_MethodParameters();

		mp.addNumber(10, 20);
		mp.printMessage("Explaining methods in java");
	}

}
