package com.simplilearn.exception;

public class FinallyExample {

	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("i am try");
			
			System.out.println(10/0);
			//System.out.println(a/b);
			
			
		}catch(Exception e){
			
			System.out.println("I am Catch");
			
		}	
				
		finally {	
			//System.exit(0);// Stop the Execution / JVM
			System.out.println("I am finally");
			// no operation code 
			// Finally block does not contain any logical code 
			
		}
	}
}
