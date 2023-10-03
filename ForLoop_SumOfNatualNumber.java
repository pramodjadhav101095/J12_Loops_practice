package com.prowings.Loops;

public class ForLoop_SumOfNatualNumber {

	public static void main(String[] args) {

		// Program to find the sum of natural numbers from 1 to 1000.

		int sum = 0;
		int n = 1000;

		for (int i = 1; i <= n; i++) {

			sum = sum + i;
			}
		System.out.println("sum"+ sum);
	}

}
