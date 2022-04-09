package com.simplilearn.thread;

public class MyThreadMain {

	public static void main(String[] args) {
		
		MyThread mythread= new MyThread();// I am creating the instance of thread defination class 		
		Thread thread= new Thread(mythread);// Target the MyThread
		thread.start();// ANd start the Targated Thread
		
		// How to create the Thread using Runnable interface
		// Is there any doubt , While creating the Thread using Thread Class - Clear 
	}
}
