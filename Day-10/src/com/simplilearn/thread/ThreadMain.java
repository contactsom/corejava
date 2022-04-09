package com.simplilearn.thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		//new/born State    (t.start) ->  Ready/Runnable State    -> Running State     -> Dead State
		// Pause 
		
		MyThread myThread = new MyThread();//2. Ready/Runnable State 
		myThread.start();//3. Running State
		//myThread.MAX_PRIORITY;
				
		System.out.println("Default Thread Priprity");
		System.out.println(myThread.getPriority());//5
		System.out.println(myThread.getName());//5
		
		myThread.setPriority(10);//10
				
		System.out.println("After set Thread Priprity");
		System.out.println(myThread.getPriority());
		System.out.println(myThread.getName());//5
				
		
		for (int i = 0; i <= 3; i++) {
			
			System.out.println("I am Main Thread");
		}
		
		
		//4. Dead State
	}
}
