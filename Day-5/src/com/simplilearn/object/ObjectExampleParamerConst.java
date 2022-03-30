package com.simplilearn.object;

import com.student.branch.StudentBranch;

public class ObjectExampleParamerConst {

	
	public static void main(String[] args) {
				
		
		StudentBranch sb2= new StudentBranch("mechanical",303,true,99.9F);
		StudentBranch sb1= new StudentBranch();
		
		System.out.println(sb2.toString());		
		System.out.println(sb1.toString());
		
		// Object
		// Default Constructor 
		// parametrized Constructor 
		
	}
}
