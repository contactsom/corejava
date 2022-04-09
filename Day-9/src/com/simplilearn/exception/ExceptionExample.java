package com.simplilearn.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		int a=10;
		int b=20;			
		try {
			System.out.println(10/2);//5.// No Problem
			System.out.println(10/0);// Problem
			
			
		} catch (Exception e) {			
			int c= a+b;
			System.out.println(c);// 30 ?
		}
			
	}
}