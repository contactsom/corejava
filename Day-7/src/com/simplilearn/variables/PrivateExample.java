package com.simplilearn.variables;

public class PrivateExample {
	
	private String var1 ="I am Private Variables";

	public static void main(String[] args) {		
		
		//private static String var1 ="I am Private Variables";
		
		PrivateExample privateExample= new PrivateExample();
		//privateExample.var1		
		System.out.println(privateExample.var1);
		
		//privateExample.geMyName(var1);
	}
	
	public void geMyName(String var) {
		
		System.out.println("I am from another method "+var);
		
	}
}
