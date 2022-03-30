package com.simplilearn.flowcontrol;

public class ForEachExample {

	
	public static void main(String[] args) {
		
		char myArray[] = {'A','B','C','D'};
		
		for (char c : myArray) {
			
			System.out.println(c);
		}
		
		// java 1.5
		System.out.println("***********************");
		
		int myIntArray[] = {5,7,1,3,9,4};
		
		for(int value:myIntArray) {
			
			System.out.println(value);
			
		}
		
		
		
	}
}
