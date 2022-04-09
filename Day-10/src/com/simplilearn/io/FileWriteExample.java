package com.simplilearn.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	
	public static void main(String[] args) throws IOException {
		
		 File dir= new File("/Users/om/Simplilearn/Day-10/src/assessment");
		 dir.mkdir();// to create the directory
		 
		 
		 File f = new File("/Users/om/Simplilearn/Day-10/src/assessment/demo.txt");			 		 		 
		 f.createNewFile();
		 
		
		
		FileWriter fw= new FileWriter("/Users/om/Simplilearn/Day-10/src/assessment/demo.txt",false);
		fw.write("Hi");
		fw.write("\n");
		fw.write("Good Morning");
		fw.write("\n");
		fw.write("How Are You");
		fw.write("\n");
		fw.write("Are you enjoying Learning");
		fw.write("\n");
		fw.write("Is Your Instructor is good");
		fw.write("\n");
		
		fw.flush();//
		fw.close();
		
	}
}
