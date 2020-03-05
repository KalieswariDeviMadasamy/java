package com.bottom.up;


/**
 * Ugly numbers are numbers whose only prime factors are 2, 3 or 5.
 * The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers.
 * By convention, 1 is included.
 *
 */
public class UglyNumbers {
	
	static int n = 25;
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		int ugly[] = new int[n];
		int nextMultiple2 = 2;
		int nextMultiple3 = 3;
		int nextMultiple5 = 5;
		int i2 = 0, i3 = 0, i5 = 0;
		ugly[0] = 1;
		System.out.println(ugly[0]);
		int nextUglyNo;
		for (int i=1; i<n; i++) {
			nextUglyNo = Math.min(nextMultiple2, Math.min(nextMultiple3, nextMultiple5));
			ugly[i] = nextUglyNo;
			if (nextUglyNo == nextMultiple2) {
				i2++;
				nextMultiple2 = ugly[i2]*2;
			}
			if (nextUglyNo == nextMultiple3) {
				i3++;
				nextMultiple3 = ugly[i3]*3;
			}
			if (nextUglyNo == nextMultiple5) {
				i5++;
				nextMultiple5 = ugly[i5]*5;
			}
			System.out.println(nextUglyNo);
		}
		long end = System.nanoTime();
		
		System.out.println("Time taken " + (end-start) + "ns");
		
	}

}
