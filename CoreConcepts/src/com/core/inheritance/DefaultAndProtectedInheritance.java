package com.core.inheritance;

import com.core.accessmodifiers.DefaultAndProtected;

public class DefaultAndProtectedInheritance extends DefaultAndProtected {
	public static void main(String[] args) {
		DefaultAndProtectedInheritance obj = new DefaultAndProtectedInheritance();
		//obj.defaultMethod(); compiler error - not visible
		obj.method();// diff package, but inherited - so visible
	}
}
