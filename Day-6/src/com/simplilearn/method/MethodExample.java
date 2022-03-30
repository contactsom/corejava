package com.simplilearn.method;

public class MethodExample {

	public static void main(String[] args) {

		
		MethodExample obj1=new MethodExample();
		obj1.checkEven();
		//obj1.checkThreeDiv();		
		// why method is used for - true / false  
		
	}

	public void checkEven() {
		int num = 21;
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}		
	}

	public void checkThreeDiv() {		
		int num1 = 30;
		if (num1 % 3 == 0) {
			System.out.println("number is perfectely divisible by 3");
		} else {
			System.out.println("number is NOt perfectely divisible by 3");
		}
	}
	
	//accessModifer return methodName(argumen1, arg2, arg3 ........) {
				
		/// your code goes here 
		
	//}

}
