package com.rick.java.fundamentals;

/**
* Author: Rick_Richards
* @since 26 feb 2026
*/
/*
 * The Scanner class is used to read input from different sources,
 * such as the keyboard, files, or streams.
 *
 * In most beginner programs, Scanner is used to read user input
 * from the console (System.in).
 *
 * It allows us to capture different data types like:
 * - String
 * - int
 * - double
 * - boolean
 *
 * Once a Scanner is opened, it should be closed to prevent
 * resource leaks.
 */
import java.util.Scanner;

public class A04_ScannerClass {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

		System.out.println("---- Reading a String ----");
		System.out.print("Enter your name: ");
		String name = SC.nextLine();
		System.out.println("Hello, " + name);

		System.out.println("-----------------------------------");

		System.out.println("---- Reading an Integer ----");
		System.out.print("Enter your age: ");
		int age = SC.nextInt();
		System.out.println("You are " + age + " years old.");

		System.out.println("-----------------------------------");

		System.out.println("---- Reading a Double ----");
		System.out.print("Enter your height (in meters): ");
		double height = SC.nextDouble();
		System.out.println("Your height is " + height + " meters.");

		System.out.println("-----------------------------------");

		System.out.println("Scanner closed successfully.");

		SC.close();

	}

}
