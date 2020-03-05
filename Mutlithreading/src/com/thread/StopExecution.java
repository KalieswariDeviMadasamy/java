package com.thread;

public class StopExecution {
	
	public static void main(String[] args) throws InterruptedException { 
		Runnable sleepDemo = () -> {
			for (int i=0; i<5 ; i++) {
	            System.out.println(Thread.currentThread().getName()  + " in control"); 
	            try
	            { 
	                // thread to sleep for 1000 milliseconds 
	                Thread.sleep(500); 
	            } 
	  
	            catch (Exception e) 
	            { 
	                System.out.println(e); 
	            } 
			}
			
		};
		
		Runnable yieldDemo = () -> {
			for (int i=0; i<5 ; i++)
	            System.out.println(Thread.currentThread().getName()  + " in yield control"); 
		};
	
		
		//Code for sleep Demo
		
		/*Thread sleep = new Thread(sleepDemo); 
		sleep.start();
		
		Thread sleep1 = new Thread(sleepDemo); 
		sleep1.start();*/
		
		//Code for yield Demo
		
		/*Thread yield = new Thread(yieldDemo);
		yield.start();
		
		for (int i=0; i<5 ; i++) {
			// Control passes to child thread 
            Thread.yield(); 
  
            // After execution of child Thread 
            // main thread takes over 
            System.out.println(Thread.currentThread().getName()  + " in control"); 
		}*/
		
		//Code for join Demo

		
		Runnable joinDemo = () -> {
			Thread t1 = new Thread(yieldDemo);
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\nJoining after Thread t1 execution ends \n"); 
			
			for (int i=0; i<5 ; i++) 
	            System.out.println(Thread.currentThread().getName()  + " in control"); 
			
		};
		
		Thread t = new Thread(joinDemo);
		t.start();
		t.join();
		
		System.out.println("\nJoining after Thread t execution ends \n"); 
		System.out.println("Current thread: " + 
				Thread.currentThread().getName()); 
		
		
	}

}
