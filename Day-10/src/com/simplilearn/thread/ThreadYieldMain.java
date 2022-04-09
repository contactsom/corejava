package com.simplilearn.thread;

public class ThreadYieldMain {

	public static void main(String[] args) {
		
		ThreadYield threadYield = new ThreadYield();//2
		threadYield.start();//3
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
		
		//4
	}
}
