package com.simplilearn.variables;

import com.simplilearn.variables1.OutSidePackage;

public class DefaultMain {

	public static void main(String[] args) {
		
		//DefaultExample defaultExample = new DefaultExample();			
		//String username= defaultExample.UsrName;
		//System.out.println(username);
		
	
		//System.out.println(defaultExample.myNmae);
		
		
		
		PrivateExample privateExample = new PrivateExample();
		//String var=privateExample.var1;
		
		
		
		
		
		
		OutSidePackage outSidePackage = new OutSidePackage();
		//outSidePackage.UsrNameOutSide
		System.out.println(outSidePackage.myNmae1);
		
		
		//String myvar=outSidePackage.UsrNameOutSide;
		
		
	}
}
