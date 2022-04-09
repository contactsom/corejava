package com.simplilearn.thread;

public class ThreadYield  extends Thread{

	//1
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println("Child Thread");
		}
	}
}
