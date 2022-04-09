package com.simplilearn.io;

import java.io.File;
import java.io.IOException;

public class FileExample {
	
	public static void main(String[] args) throws IOException {
        
		
		 File dir= new File("/Users/om/Simplilearn/Day-10/src/Wishes");
		 dir.mkdir();// to create the directory

		// To Create  the file 
		 File f = new File("/Users/om/Simplilearn/Day-10/src/Wishes/abc.txt");			 		 		 
		 System.out.println(f.exists());// false // To check if file creeated
		 f.createNewFile();
		 System.out.println(f.exists());// true
		 
		 
		 File f1 = new File("/Users/om/Simplilearn/Day-10/src/Wishes/abc1.txt");			 		 		 
		 f1.createNewFile();
		 
		 
		 File f2 = new File("/Users/om/Simplilearn/Day-10/src/Wishes/abc2.txt");			 		 		 
		 f2.createNewFile();
		 
		 File f3 = new File("/Users/om/Simplilearn/Day-10/src/Wishes/abc3.txt");			 		 		 
		 f3.createNewFile();
		 
		 System.out.println("**** Before Delete");
		 // I want to check list of file 
		 File files = new File("/Users/om/Simplilearn/Day-10/src/Wishes/");	
		 String[] listofFiles=files.list();
			 
		 
		 for (String file : listofFiles) {
			
			 System.out.println(file);
			 
		}
		 
		 // Deleting the file 
		 File delet = new File("/Users/om/Simplilearn/Day-10/src/Wishes/abc3.txt");	
		 delet.delete();
		 
		 
		 System.out.println("**** After Delete");
		 // I want to check list of file 
		 File files1 = new File("/Users/om/Simplilearn/Day-10/src/Wishes/");	
		 String[] listofFiles1=files.list();
			 
		 
		 for (String file1 : listofFiles1) {
			
			 System.out.println(file1);
			 
		}
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
}
