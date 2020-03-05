package com.top.down;

public class ArrangementsToSum {
	
	static int dp[];

	static int arr[] = {1, 5, 8};
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		int n = 13;
		dp = new int[n+1];
		solve(n);
		long end = System.nanoTime();
		for (int i = 0; i< n+1 ; i++)
			System.out.println(dp[i]);
		System.out.println("Time taken " + (end-start) + "ns");
		
	}
	
	static int solve(int n) {
		if (n < 0)
			return 0;
		if (n == 0)
			return 1;
		if (dp[n] != 0)
			return dp[n];
		return dp[n] = solve(n-arr[0]) + solve(n-arr[1]) + solve(n-arr[2]);
	}
}
