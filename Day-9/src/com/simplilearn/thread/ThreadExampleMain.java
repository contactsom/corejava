package com.simplilearn.thread;

public class ThreadExampleMain {

	// Main Thread
	public static void main(String[] args) {
				
		ThreadExample threadExample = new ThreadExample();// instantiation of thread
		threadExample.start();// I am Starting the Thread
		//threadExample.run();// This is not a Thread method it just like other method
		
	}
}


