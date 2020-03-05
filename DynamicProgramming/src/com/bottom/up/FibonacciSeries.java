package com.bottom.up;

/**
 * The Fibonacci numbers are the numbers in the following integer sequence.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
 * 
 * In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation
 * Fn = Fn-1 + Fn-2
 * with seed values
 * F0 = 0 and F1 = 1.
 *
 */
public class FibonacciSeries {
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		int n = 40;
		int[] dp = new int[n];
		dp[0] = 0;
		dp[1] = 1;
		System.out.println(dp[0]);
		for(int i = 2; i<n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
			System.out.println(dp[i-1]);
		}
		long end = System.nanoTime();
		
		System.out.println("Time taken " + (end-start) + "ns");
	}

}
