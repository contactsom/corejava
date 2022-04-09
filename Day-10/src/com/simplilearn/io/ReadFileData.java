package com.simplilearn.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileData {

	public static void main(String[] args) throws IOException {		
		File f= new File("/Users/om/Simplilearn/Day-10/src/assessment/demo.txt");		
		FileReader fr= new FileReader(f);		
		System.out.println(f.length());				
		char[] ch2= new char[82];		
		fr.read(ch2);			
         for (char c : ch2) {			
        	 System.out.println(c);
		}         
         System.out.println("***************");		
		FileReader far= new FileReader(f);
        int i=far.read();        
        while(i!=-1) {        	
        	System.out.println((char)i);
        	i=far.read();      	
        	
        }			
	}
}
