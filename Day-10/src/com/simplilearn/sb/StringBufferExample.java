package com.simplilearn.sb;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("Core");// all method are synchronized, low performane , 1.0 v
		sb.append("JAVA");
		
		
		System.out.println(sb);//
		
		
		StringBuilder sbb= new StringBuilder();// no method is synchronized , performance is high, 1.5 V
		
		
		
	}
}
