package com.core.inheritance;

import com.core.accessmodifiers.DefaultAndProtected;

public class AccessModifierExample2 {
	public static void main(String[] args) {
		DefaultAndProtected obj = new DefaultAndProtected();
		//obj.defaultMethod(); compiler error - not visible
		//obj.method(); compiler error - not visible
	}
}
