package com.simplilearn.flowcontrol;

public class SwitchExampleWithBreak {

	public static void main(String[] args) {
		
		int x=10;		
		switch (x) {		
		case 10 :
			 System.out.println("10");
			 break;
		case 11 :
			 System.out.println("11");
			 break;
		case 100 :			
			 System.out.println("100"); 
			 break;
		}
		//if we can use break then why we are writting 
		//more cases?

		
	}
}
