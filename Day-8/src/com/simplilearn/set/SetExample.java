package com.simplilearn.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> mySet= new HashSet<String>();
		//Initial size was 16
		// when 17th element try to insert the size will automaticly increased by 75%
		
		
		mySet.add("A");//1
		mySet.add("B");
		mySet.add("C");
		mySet.add("D");
		mySet.add("A");//2
		System.out.println(mySet);// Error or not error 
		
		

		Set<Integer> mySet1= new HashSet<Integer>();
		mySet1.add(1);//1
		mySet1.add(2);
		mySet1.add(3);
		mySet1.add(4);
		mySet1.add(null);
		mySet1.add(3);//2
		System.out.println(mySet1);// Error or not error 
		
		//then how it is possible to preserve insertion but avoid duplicate? 
		//like a dropdwon menu

		
		Set<String> myset2= new LinkedHashSet<String>();
		myset2.add("LA");
		myset2.add("LB");
		myset2.add("LC");
		myset2.add(null);
		System.out.println(myset2);
		
		
		Set<String> myset3= new TreeSet<String>();
		myset3.add("LA");
		myset3.add("LB");
		myset3.add("LC");
		//myset3.add(null);
		System.out.println(myset3);
		
		
	
		
		
		
		
		
		
	}
}
