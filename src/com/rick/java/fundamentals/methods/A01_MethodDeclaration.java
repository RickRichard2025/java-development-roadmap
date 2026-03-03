package com.rick.java.fundamentals.methods;

/**
 * Author: Rick_Richards
 * 
 * @since 3 mar 2026
 */

public class A01_MethodDeclaration {
	// This method is without parameters and without return
	public void greet() {
		System.out.println("Hello World!");
	}

	// and this one is with return but without parameters
	public String getMessage() {
		return "Java Methods";
	}

	public static void main(String[] args) {

		A01_MethodDeclaration md = new A01_MethodDeclaration();
		md.greet();
		System.out.println(md.getMessage());

	}
}