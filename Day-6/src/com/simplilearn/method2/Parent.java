package com.simplilearn.method2;

abstract class Parent {
	
	// Why abstract method needed 
	
	abstract void getParent();	
	abstract void getEEE();
	abstract void getCIVIL();
	abstract void getME ();
		
	public void getEC() {
			 System.out.println("I am getEC from parent");
    }
	
	public void getCS() {
		 System.out.println("I am getCS from parent");
	}
		
	
	// ABC college 
	// CMS
	// EC , CS , EEE, CIVIL, ME
	// 2022 
	// EC , CS - deal with this bracnch only
	// Extend EEE, CIVIL, ME - feature branch 
}
