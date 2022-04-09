package com.simplilearn.thread;

// Defination of thread 
public class ThreadExample  extends Thread{	
	@Override
	public void run() {	
		
		for (int i = 0; i < 6; i++) {
			System.out.println("I am run");
			
		}
		
	}
}
