package com.simplilearn.variablesb;

import com.simplilearn.variablesa.ProtectedExample;

public class ProtuctedMain extends ProtectedExample{

	//ProtuctedMain = child
	//ProtectedExample = parent
	
	public static void main(String[] args) {
		//ProtectedExample protectedExample = new ProtectedExample();
		//String name=protectedExample.myNme;
		
		ProtuctedMain protuctedMain = new ProtuctedMain();	// child class	
		System.out.println(protuctedMain.myNme);
		// with the help of child class object I am calling parent class variables ?
		
	}
}
