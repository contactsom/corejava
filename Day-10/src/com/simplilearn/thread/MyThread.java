package com.simplilearn.thread;

public class MyThread extends Thread {

	//1. new/born State 
	public void run() {
		
		for (int i = 0; i <=3; i++) {
			
			System.out.println("I am child Thread");
		}
	}
}
