package com.simplilearn.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> myMap = new HashMap<Integer,String>();
		// it store the data in KEY and Value pair 
		// I wnat to collet a data 
		myMap.put(1, "A");
		myMap.put(2, "B");
		myMap.put(3, "C");
		myMap.put(4, "D");
		myMap.put(5, "E");	
		myMap.put(5, "F");	
		System.out.println(myMap);
		
		//is there any advantage?
		// is key duplicate ?

		
		Map<String,String> myMap1 = new HashMap<String,String>();
		// it store the data in KEY and Value pair 
		// I wnat to collet a data 
		myMap1.put("101", "A");
		myMap1.put("102", "B");
		myMap1.put("103", "C");
		myMap1.put("104", "D");
		myMap1.put("105", "E");	
		myMap1.put("105", "F");	
		myMap1.put("106", "A");	
		myMap1.put(null, null);	
		System.out.println(myMap1);
		
		// Size : default 16
		// Increment ratio : 75%

		//Pliz display all diff 

//is map is a class?, becoz we are creating a object  know?



		Map<Integer, String> myMpa2= new Hashtable<Integer, String>();
		myMpa2.put(201, "M");
		myMpa2.put(202, "N");
		myMpa2.put(203, "K");
		myMpa2.put(204, "L");
		//myMpa2.put(null, null);
        System.out.println(myMpa2);
        
        //sir to create object ..first we write class name..then object 
        //and new keyword and constructor ...but in maps your saying it is interface

        //Iterable               
        // MAP
        // Exception Handeling
        
        
        
        
        // TREE MAP HW
        
        

		
		
		
		
		
		
		//can we repeat value?

		
		
		
		
	}
}
