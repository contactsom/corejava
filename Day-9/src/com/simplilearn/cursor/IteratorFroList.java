package com.simplilearn.cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorFroList {

	public static void main(String[] args) {
		
		List <Integer> myList = new ArrayList<Integer>();
				
		//myList.add(00000000000010101001000000101001010100101);
		
		// Compile Time - Error
		// Runtime - Exception
		
		// Checked Exception :
		
		// I went to Exam hall to write my Exam paper
		// HallTicketMissingExcception - Hall Ticket 
		// PentNotFoundException       - Pen 
		// I found- Compiler 
		// Successfully write the exam 
		// The Exception which are checked by compiler for smooth execution of the program at run time are called 
		// "Checked- Exception"
		
		
		//The Exception Which are not checked by compiler are called un-checked Exception
		// Fir
		// BomBlast
		// Earth Quick
		
		
		
		
		
		
		
		
		
		for (int i = 0; i < 10; i++) {
			 myList.add(i);		
			
		}
		
		//System.out.println(myList);
		
		Iterator itr= myList.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		
	}
}
