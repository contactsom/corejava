package com.simplilearn.method;

public class MethodReturnStringExample {

	
	public static void main(String[] args) {
		MethodReturnStringExample obj1= new MethodReturnStringExample();
		
		
		//String myoutput=obj1.isEven();
		obj1.isEven();

		//System.out.println(myoutput);		
	}
	
	
	public String isEven() {		
		int a=21;
		String output="";		
		if(a%2==0) {			
			output="Even";
		}else {			
			output="Odd";
		}
		
		return output;
	}
}









