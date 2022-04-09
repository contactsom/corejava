package com.simplilearn.thread;

public class SleepThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
				
		for (int i = 0; i < 5; i++) {
			
			System.out.println("I am main");
			
			Thread.sleep(5000);
		}
		
		
	}
}
