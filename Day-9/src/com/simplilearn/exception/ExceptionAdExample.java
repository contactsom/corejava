package com.simplilearn.exception;

public class ExceptionAdExample {

	public static void main(String[] args) {
		
		try {
			System.out.println("I am 1");
			System.out.println(10/0);// Exception
			
		} catch (Exception e) {
			
			System.out.println("I am 2");
			
			try {
				System.out.println("I am 3");
				System.out.println(20/0); // Exception				
			} catch (Exception e2) {
				System.out.println("I am 4");
			}
				
			
		}
	}
}
