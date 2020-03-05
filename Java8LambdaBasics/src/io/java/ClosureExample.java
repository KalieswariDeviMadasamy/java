package io.java;

import java.util.Properties;

public class ClosureExample {
	
	public static void main(String[] args) {
		int a = 20, b=10;
		//doProcess(a, i -> System.out.println( i+b ));
		
		Properties p = System.getProperties();
        p.setProperty("pirate","scurvy");
        String s = p.getProperty("argProp") + " ";
        s += p.getProperty("pirate");
        System.out.println(s); 
			     
	}
	
	public static void doProcess(int a, Process p) {
		p.process(a);
	}
	
	interface Process {
		void process(int i);
	}


}
