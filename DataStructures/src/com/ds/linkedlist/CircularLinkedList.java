package com.ds.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CircularLinkedList<T> {
	
	class Node<T> {
		T data;
		Node<T> next;
		
		Node(T data) {
			this.data = data;
		}
	}
	
	public boolean isCircular(Node<T> head) {
		if (head == null)
			return true;
		Node<T> temp = head.next;
		while (temp != null && temp != head)
			temp = temp.next;
		return temp == head;
	}
	
	public static void main(String[] args) {
		/*int n=3, q=6;
		String str = "aba";
		List<String> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				if(!list.contains(str.substring(i, j)))
				list.add(str.substring(i, j));
			}
		}
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
		HashSet<Character> hs = new HashSet<>();
		String str1 = list.get(4-1);
		for(int i=0; i<str1.length(); i++)
			hs.add(str1.charAt(i));
		System.out.println(hs.size());*/
		
		/*int arr[] = {245, 78};
		int n=2;
		HashSet<Character> hs = new HashSet<>();
		int sum =0, j=0;
		Arrays.sort(arr);
		for (int i=n-1; i>=0; i--) {
			String str = String.valueOf(arr[i]);
			for(j=0; j<str.length();j++) {
				if(hs.contains(str.charAt(j))) {
					break;
				}
			}
			if( j== str.length()) {
				sum+= arr[i];
				for(int k =0;k<str.length();k++)
					hs.add(str.charAt(k));
			}
		}
		System.out.print(sum);*/
		
	}

}
