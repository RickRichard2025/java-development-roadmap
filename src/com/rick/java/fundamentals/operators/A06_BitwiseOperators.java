package com.rick.java.fundamentals.operators;

/**
 * Author: Rick_Richards
 * 
 * @since 26 feb 2026
 */

/*
 * Bitwise operators work directly on the binary representation of numbers.
 *
 * Every integer in Java is stored in binary form. Bitwise operators allow us to
 * manipulate those bits one by one.
 *
 * These operators are not used as often in everyday business code, but they are
 * important in: - Low-level programming - Performance optimization -
 * Cryptography - Flags and permissions systems
 *
 * Operators covered here:
 *
 * & Bitwise AND | Bitwise OR ^ Bitwise XOR (exclusive OR) ~ Bitwise complement
 *
 * If logical operators work with true/false, bitwise operators work with 1s and
 * 0s.
 */

public class A06_BitwiseOperators {

	public static void main(String[] args) {

		int a = 5; // binary: 0101
		int b = 3; // binary: 0011

		// Bitwise AND (&)
		int andResult = a & b; // 0001
		System.out.println("a & b: " + andResult);

		// Bitwise OR (|)
		int orResult = a | b; // 0111
		System.out.println("a | b: " + orResult);

		// Bitwise XOR (^)
		int xorResult = a ^ b; // 0110
		System.out.println("a ^ b: " + xorResult);

		// Bitwise complement (~)
		int complementResult = ~a;
		System.out.println("~a: " + complementResult);

		System.out.println("-----------------------------------");

		// Practical example: using bits as flags
		int READ = 1; // 0001
		int WRITE = 2; // 0010
		int EXECUTE = 4; // 0100

		int permissions = READ | WRITE; // 0011

		System.out.println("Permissions value: " + permissions);

		// Check if WRITE permission exists
		boolean canWrite = (permissions & WRITE) != 0;
		System.out.println("Has write permission: " + canWrite);

		// Check if EXECUTE permission exists
		boolean canExecute = (permissions & EXECUTE) != 0;
		System.out.println("Has execute permission: " + canExecute);

	}
}
