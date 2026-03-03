package com.rick.java.fundamentals.math;

/**
 * Author: Rick_Richards
 * 
 * @since 3 mar 2026
 */

/*
 * In this lesson I am going to show you the most used in Math in java
 */
public class A03_MathClass {
	public static void main(String[] args) {

		// Math
		double root = Math.sqrt(16); // 4.0
		double potency = Math.pow(2, 3); // 8.0
		double random = Math.random() * 10 + 1; // between 1.00 and 10.00

		System.out.println("Raíz: " + root);
		System.out.println("Potencia: " + potency);
		System.out.println("Aleatorio: " + random);
		System.out.println("");

		// CONSTANS
		System.out.println("Number e: " + Math.E);
		System.out.println("PI value is: " + Math.PI);
		System.out.println("");

		// CONVERSIONS
		double angleInDegrees = 45;
		double angleInRadians = Math.toRadians(angleInDegrees);
		System.out.println("Deg a Rad " + angleInDegrees + " ° = " + angleInRadians + " Rad.");

		angleInDegrees = Math.toDegrees(angleInRadians);
		System.out.println("Rad a Deg " + angleInRadians + " Rad = " + angleInDegrees + "°.");
		System.out.println("");

		// TRIGONOMETRIC FUNCTIONS
		double angleDegrees = 30;
		double angleRadians = Math.toRadians(angleDegrees);

		double sine = Math.sin(angleRadians);
		double cosine = Math.cos(angleRadians);
		double tangent = Math.tan(angleRadians);

		// Radians to degrees
		double degrees = Math.toDegrees(angleRadians);

		System.out.println("Sine of " + angleDegrees + "°: " + sine);
		System.out.println("Cosine of " + angleDegrees + "°: " + cosine);
		System.out.println("Tangent of " + angleDegrees + "°: " + tangent);
		System.out.println("Convert back to degrees: " + degrees);

	}

}
