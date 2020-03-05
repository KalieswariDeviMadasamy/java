package com.core.staticblock;

public class StaticBlock {
	
	int i;
	static int j;
	
	{
		i = 2;
		j = 3;
		System.out.println("Initialization Block");
	}
	
	static {
		j = 4;
		System.out.println("Static Block");
	}
	
	StaticBlock() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		StaticBlock sb = new StaticBlock();
		System.out.println(sb.i);
		System.out.println(sb.j);
	}

}
