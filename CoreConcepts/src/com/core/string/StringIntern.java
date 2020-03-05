package com.core.string;

public class StringIntern {
	
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		
		//A new obj is created in the heap and also in string pool, ref to heap is returned.
		String s3 = new String("Hi");
		//On calling intern method, it checks whether the string pool contains a value, if so returns a ref to it.
		String s4 = s3.intern();
		String s5 = s3.intern();
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s4 == s5);
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
	}

}
