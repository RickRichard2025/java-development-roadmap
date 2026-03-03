package com.rick.java.fundamentals.math;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Author: Rick_Richards
 * 
 * @since 3 mar 2026
 */

/*
 * Here in this class we are going to learn how to limit decimals There are a
 * few of options and I will try to show you the most common ones
 */

public class A02_DecimalLimits {

	// 1 String.format*()
	public String StringFormat(double number) {

		return String.format("%.3f", number);
	}

	// 2. System.out.printf();
	public PrintStream printF(double number) {
		return System.out.printf("%.2f%n", number);
	}

	// 3. BigDecimal
	public double bigDecimal(double numberBig) {
		BigDecimal bd = new BigDecimal(numberBig);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();

	}

	public static void main(String[] args) {
		A02_DecimalLimits dl = new A02_DecimalLimits();
		String result = dl.StringFormat(3.141592);
		System.out.println(result); // 3.142
		dl.printF(1.2345);
		double result1 = dl.bigDecimal(3.141592);
		System.out.println(result1); // 3.14
	}

}

/*
 * how to determine which one is better? That depends totally on the scenario,
 * to print out the String.format() to calculate precisely the BigDecimal
 */
