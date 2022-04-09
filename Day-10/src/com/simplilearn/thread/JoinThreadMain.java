package com.simplilearn.thread;

public class JoinThreadMain {

	public static void main(String[] args) throws InterruptedException  {
		
		JoinThread joinThread = new JoinThread();
		joinThread.start();
		
		
		joinThread.join();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("I am main");
		}
			
		
	}
}
