package com.simplilearn.string;

public class StringInterview {

	public static void main(String[] args) {
		
		String s1= new String ("You can not change me");
		String s2= new String ("You can not change me");
		
		System.out.println(s1==s2);// False
		
		String s3="You can not change me";
		String s4="You can not change me";
		System.out.println(s3==s4);// True
		
		
		String s5="You can not"+" change me";
		System.out.println(s5);
		System.out.println(s3==s5);//true/false
		
		
		System.out.println(s1.equals(s2));//true/False
		
	}
}
