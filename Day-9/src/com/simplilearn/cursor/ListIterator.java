package com.simplilearn.cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		
		List <Integer> myList = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			 myList.add(i);		
			
		}
		
		Iterator itr= myList.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//itr.
		}
		
		
	}
}
