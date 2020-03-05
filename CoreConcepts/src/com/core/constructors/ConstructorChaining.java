package com.core.constructors;

public class ConstructorChaining {
	
	public static void main(String[] args) {
		BaseClass b = new BaseClass();
		ChildClass c = new ChildClass();
		//ChildClass c1 = new BaseClass(); //--> Compile time error
		BaseClass b1 = new ChildClass();
	}

}
