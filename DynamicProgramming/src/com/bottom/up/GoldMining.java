package com.bottom.up;

import java.nio.file.attribute.GroupPrincipal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GoldMining {
	
	static int m= 3, n = 3;
	public static void main(String[] args) {
		long start = System.nanoTime();
		
		int[][] gold = {{1,3,3},
						{2,1,4},
						{0,6,4}};
		int[][] goldTable = new int[m][n];
		
		int right, rightUp, rightDown;
		
		for(int col = n-1; col >= 0; col--) {
			for(int row = 0; row < m; row++) {
				right = (col == n-1) ? 0: goldTable[row][col+1];
				rightUp = (col == n-1 || row == 0) ? 0: goldTable[row-1][col+1];
				rightDown = (col == n-1 || row == m-1) ? 0: goldTable[row+1][col+1];
				
				goldTable[row][col] = gold[row][col] + Math.max(right, Math.max(rightUp, rightDown));
			}
		}
		int res = goldTable[0][0];
		for(int i=1; i<m; i++) {
			res = Math.max(res, goldTable[i][0]);
		}
		System.out.println(res);
		long end = System.nanoTime();
		
		System.out.println("Time taken " + (end-start) + "ns");
		
	}

}
