package com.simplilearn.method;

public class MethodArgumentExample {

	
	public static void main(String[] args) {
		
		MethodArgumentExample mthodArgumentExample = new MethodArgumentExample(); 
	
		
		int output=mthodArgumentExample.getSum(3, 4);
		System.out.println(output);
		
		int output1=mthodArgumentExample.getSum(20, 30);
		System.out.println(output1);
		
		int output2=mthodArgumentExample.getSum(30, 100);
		System.out.println(output2);
		
		System.out.println("*************Multiply Example***************");
		
		int multiOutput1=mthodArgumentExample.getMultiply(8, 9);
		System.out.println(multiOutput1);
		
		
		int multiOutput2=mthodArgumentExample.getMultiply(10, 9);
		System.out.println(multiOutput2);
				
	}
	
	public int getMultiply(int a, int b) {		
		int c= a*b;
		return c;
		
		//return a*b;
	}
	
	
	public int getSum(int a , int b) {
			
		int c= a+b;
		
		return c;
	}
}
