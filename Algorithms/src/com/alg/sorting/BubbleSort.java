package com.alg.sorting;

/**
 * Bubble sort - In each iteration, it compares the current element with its adjacent element and swaps it,
 * thus placing the largest element at the end of the list in first iteration and second largest in the second 
 * iteration and so on, hence the name.
 *
 */
public class BubbleSort {
	public void sort(int[] a) {
		int n = a.length;
		int temp;
		for (int i=0; i<n-1; i++) {
			for (int j=0; j<n-1-i; j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			printArray(a, n);
		}
	}
	
	public void printArray(int[] a, int n) {
		for (int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int a[] = {5, 8, 2, 6, 1};
		sort.sort(a);
	}

}
