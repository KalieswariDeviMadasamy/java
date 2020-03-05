package com.alg.sorting;

/**
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) 
 * from unsorted part and putting it at the beginning.
 * 
 * The algorithm maintains two subarrays in a given array.
 * 1) The subarray which is already sorted.
 * 2) Remaining subarray which is unsorted.
 * 
 * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray 
 * is picked and moved to the sorted subarray.
 * 
 * arr[] = 64 25 12 22 11
 * Find the minimum element in arr[0...4]
 * and place it at beginning
 * 11 25 12 22 64
 * 
 * Find the minimum element in arr[1...4]
 * and place it at beginning of arr[1...4]
 * 11 12 25 22 64
 * 
 * Find the minimum element in arr[2...4]
 * and place it at beginning of arr[2...4]
 * 11 12 22 25 64
 * 
 * Find the minimum element in arr[3...4]
 * and place it at beginning of arr[3...4]
 * 11 12 22 25 64 
 * 
 * Time Complexity Best - n2, Worst - n2
 *
 */
public class SelectionSort {
	
	public void sort(int[] a) {
		int n = a.length;
		int minIndex, temp;
		for (int i=0; i<n-1; i++) {
			minIndex = i;
			for (int j=i+1; j<n; j++) {
				if(a[j]<a[minIndex]) {
					minIndex = j;
				}
			}
			temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
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
		SelectionSort sort = new SelectionSort();
		int a[] = {5, 8, 2, 6, 1};
		sort.sort(a);
	}

}
