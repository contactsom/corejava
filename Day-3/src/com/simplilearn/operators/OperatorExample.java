package com.simplilearn.operators;

public class OperatorExample {

	public static void main(String[] args) {
		
		int a=10;
		//System.out.println(a);//10
		
		System.out.println(a++);// Memory without any refrance 11
		
		int c=a++; //10+1 // Value is getting stored in c refrance
		System.out.println(c);//?
		
		System.out.println("**********************************");
		
		int x=20;
		System.out.println(x);//20		
		System.out.println(++x);//21
		System.out.println(x);//21
		
		// first increment and then assign it self
		
		System.out.println("********Q&A**********");
		int a1=20;
		
		int a2=++a1;
		System.out.println(a2);
		int a3=a1++;
		System.out.println(a3);
		
		int y=40;
		
		int y1=--y;
		System.out.println(y1);//?
		
		int y2=y--;
		System.out.println(y2);//?
		
		
		//++a , a++ or --a or a-- ?
		
		System.out.println("******More Complicated ********");
		int var1= 4;
		//int var2=++4;  //Error 
		
		int var2=++var1;
		System.out.println(var2);//?
		
		
		int var3=4;
		//int var4=++(++(++var3));
		//int var4=++(++(5));//		
		//int var4=++(5);//Error		
		//System.out.println(var4);
		
		
		final int myvar=4;//constant
		
		//System.out.println(myvar++);//Error
		
		double d1=10.5;			
		System.out.println(d1++);// 10.5		
		double d2= d1++;
		System.out.println(d2);//11.5
		
		//char ch='a';
		//System.out.println(++ch);
		
		//boolean myboolean = true;
		//System.out.println(++myboolean);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
