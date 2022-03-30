package com.simplilearn.flowcontrol;

public class SwitchEmapleWithContinue {

	
	public static void main(String[] args) {
		int x=10;
		switch (x) {
		case 1 :
			  System.out.println("1");
		case 10:
			 System.out.println("10");
			 break;
		case 11 :
			  System.out.println("11");			  
	    default :
	    	  System.out.println("I am default ");
		}
	}
}
