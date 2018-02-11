package com.shettar20.main;

public class EuclidsAlgorithm {

	/*
	 * Algorithm to find the GCD of two numbers
	 * 
	 * gcd(m,n) = gcd(n, m mod n)
	 * 
	 * Step 1: if n = 0, return value of m as the answer and stop. Otherwise
	 * move to step 2.
	 * 
	 * Step 2: Divide m by n and assign the value of the remainder to r.
	 * 
	 * Step 3: Assign the value of n to m and value of r to n. Go to step 1.
	 * 
	 */
	public static void main(String[] args) {

		Integer firstNumber = 5;
		Integer secondNumber = 10;

		if (firstNumber > secondNumber) {
			Integer temp = firstNumber;
			firstNumber = secondNumber;
			secondNumber = temp;
		}

		System.out.println("GCD: " + gcd(firstNumber, secondNumber));
	}

	private static Integer gcd(int m, int n) {
		if (n == 0) {
			return m;
		}
		return gcd(n, m % n);
	}

}
