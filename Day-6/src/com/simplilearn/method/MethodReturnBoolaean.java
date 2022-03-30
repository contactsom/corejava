package com.simplilearn.method;

public class MethodReturnBoolaean {

	
	public static void main(String[] args) {
		MethodReturnBoolaean obj1= new MethodReturnBoolaean();
		boolean output=obj1.isPass();
		System.out.println(output);
	}
			
	public boolean isPass() {
		int marks=60;
		boolean isPass=false;		
		if(marks>30) {			
			isPass=false;
		}else {
			isPass=true;
		}		
		return isPass;		
	}
}
