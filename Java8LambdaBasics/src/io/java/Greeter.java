package io.java;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		Greeting myLambda = () -> System.out.println("My Lambda");
		greeter.greet(myLambda);
		greeter.greet(() -> System.out.println("My Direct Lambda"));
		
		Thread myLambdaThread = new Thread(() -> System.out.println("Hello Thread"));
		myLambdaThread.run();
		

	}

}
