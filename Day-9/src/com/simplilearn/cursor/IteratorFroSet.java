package com.simplilearn.cursor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorFroSet {

	public static void main(String[] args) {
		
		Set<Integer> mySet= new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			mySet.add(i);
		}
		
		
		Iterator itr=mySet.iterator();
		
		while(itr.hasNext()) {// if value is exist
			System.out.println(itr.next()); // then get me the next value
		}
		
	
		
	}
}
