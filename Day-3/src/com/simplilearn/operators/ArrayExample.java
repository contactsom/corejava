package com.simplilearn.operators;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,8};//4 , 5 ,6 	
		int a1[] = {6,8,12,34};				
		int [] a2= {32,65,67,87};// Indexed based 
		
		//System.out.println(a2); // ?[I@7ad041f3
		System.out.println(a2[0]);
		System.out.println(a2[1]);
		System.out.println(a2[2]);
		System.out.println(a2[3]);
		
		// Array of Student 100 , 20
		
		
		int[] myArray= new int[5];	// Creation 
		int [] a3= {32,65,67,87};// Decleration 	
		
		
		myArray[0]=11;
		myArray[1]=12;
		myArray[2]=13;
		myArray[3]=14;
		myArray[4]=15;
		//myArray[5]=16;
		System.out.println("*************");
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		System.out.println(myArray[4]);
		//System.out.println(myArray[5]);
		
		
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		//Index 5 out of bounds for length 5
		//at com.simplilearn.operators.ArrayExample.main(ArrayExample.java:27)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
