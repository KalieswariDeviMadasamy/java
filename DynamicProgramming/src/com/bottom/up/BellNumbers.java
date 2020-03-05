package com.bottom.up;

/**
 * Number of ways to Partition a Set.
 *
 */
public class BellNumbers {
	
	static int n = 15;
	public static void main(String[] args) {
		long start = System.nanoTime();
		int[][] bell = new int[n+1][n+1];
		bell[0][0] = 1;
		System.out.println(bell[0][0]);
		for(int i=1; i<=n; i++) {
			bell[i][0] = bell[i-1][i-1];
			for(int j=1; j<=i; j++) {
				bell[i][j] = bell[i-1][j-1] + bell[i][j-1];
			}
			System.out.println(bell[i][0]);
		}
		long end = System.nanoTime();
		
		System.out.println("Time taken " + (end-start) + "ns");
	}

}
