package com.simplilearn.flowcontrol;

public class SwitchExampleWithDefault {

	public static void main(String[] args) {
		
		int x=1;		
		switch(x) {		
		case 1:
			  System.out.println("1");
		case 2:
			  System.out.println("2");
			  break;
		case 10 :
			  System.out.println("10");
			 
		default:
			  System.out.println("I am default");			  
		}
	}
}
