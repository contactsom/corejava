package com.simplilearn.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		

		
		List<String> myList= new ArrayList<String>();// I am creating the ArrayList Object	// 10	
		myList.add("A");
		myList.add("A");
		myList.add("B");
		myList.add("C");
		myList.add("D");
		myList.add("E");
		//myList.add(12);
		System.out.println(myList);
		
		
		// use my jar file it has the object called myList which hold the data as string type
		//List<String> myList= new ArrayList<String>();
		
		List<Integer> myList1= new ArrayList();// I am creating the ArrayList Object		
		
		myList1.add(2);
		myList1.add(3);
		myList1.add(4);	
		myList1.add(1);
		myList1.add(1);
		System.out.println("Before Remove"+myList1);
		
		myList1.remove(0);
		
		
		//myList1.add("MOHAN");	
		System.out.println("After Remove"+myList1);
		
		//if we need to remove the data so any option?

		
		List<Character> myList2= new ArrayList();// I am creating the ArrayList Object		
		myList2.add('C');
		myList2.add('D');
		myList2.add('E');
		myList2.add('F');
		
		//myList2.add(10.5F);
		//myList2.add(10.5F);
		System.out.println(myList2);
				
		
		//*******************************************
		
		List<String> ll1= new LinkedList();
		ll1.add("LA");
		ll1.add("LA");
		ll1.add("LB");
		ll1.add("LC");
		ll1.add("LD");
		ll1.add("LE");
		ll1.add(null);	
	
		//ll1.add(1);		
		
		System.out.println(ll1);
		
		
	}
	
}
