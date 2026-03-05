package com.rick.java.fundamentals.arrays.and.strings;

import java.util.Random;

public class A03_ArrayOperations {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[5];

		// Fill the array with random numbers
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(50) + 1; // Numbers are gonna be from 1 to 50
		}

		int sum = 0;
		int max = numbers[0];
		int min = numbers[0];

		// Iterate through the array
		for (int num : numbers) {
			sum += num;

			if (num > max) {
				max = num;
			}

			if (num < min) {
				min = num;
			}
		}

		double average = (double) sum / numbers.length;

		// In here we print the result
		System.out.println("Numbers in the array:");

		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		System.out.println("Sum: " + sum);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Average: " + average);

	}

}
