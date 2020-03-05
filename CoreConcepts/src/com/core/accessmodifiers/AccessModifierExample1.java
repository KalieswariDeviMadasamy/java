package com.core.accessmodifiers;

public class AccessModifierExample1 {
	public static void main(String[] args) {
		DefaultAndProtected obj = new DefaultAndProtected();
		obj.defaultMethod();// same package - visible
		obj.method();// same package - visible
	}
	
}
