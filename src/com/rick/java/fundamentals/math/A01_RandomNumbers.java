package com.rick.java.fundamentals.math;

import java.security.SecureRandom;

/**
* Author: Rick_Richards
* @since 3 mar 2026
*/

/*
 * In this class I will show you how to get random numbers in Java
 * 
 */

import java.util.Random;
import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;

public class A01_RandomNumbers {

	// 1 importing the library import java.util.Random;
	public int random(int bound) {
		Random rand = new Random();
		return rand.nextInt(bound) + 1;
	}

	// 2 with Math.random();
	public double mathRandom(int bound) {
		return (Math.random() * bound) + 1;

	}

	// 3. import java.util.concurrent.ThreadLocalRandom;
	public void threadLocal() {
		int random = ThreadLocalRandom.current().nextInt(1, 73);
		System.out.println(random);
	}

	// 4 import java.security.SecureRandom;
	public double secureRand(double bound) {
		SecureRandom sr = new SecureRandom();
		return sr.nextDouble(bound) + 1;
	}

	// 5 import java.util.SplittableRandom;
	public long splitRandom(long lastNumber) {
		SplittableRandom sr = new SplittableRandom();
		// I am making sure to have positive numbers only
		return sr.nextLong(1, lastNumber);
	}

	public static void main(String[] args) {

		A01_RandomNumbers rn = new A01_RandomNumbers();

		System.out.println(rn.random(50));
		System.out.println(rn.mathRandom(75));
		rn.threadLocal();
		System.out.println(rn.secureRand(100));
		System.out.println(rn.splitRandom(1000000000));
	}

}
