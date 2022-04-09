package com.simplilearn.thread;

public class SleepThread  extends Thread{

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am child ");
		}
	}
}
