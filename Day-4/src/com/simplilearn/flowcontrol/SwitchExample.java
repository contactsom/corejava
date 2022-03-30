package com.simplilearn.flowcontrol;

public class SwitchExample {
	//99
	public static void main(String[] args) {
		
		int x=10;// Order matters 
		
		switch(x) {			
					   
		case 8 :		
		        System.out.println("I am 99 case");		    
		case 9 :		
			    System.out.println("I am 9 case");
		case 10:
			   System.out.println("I am 10 case ");			   
		case 11:
			   System.out.println("I AM 11 Case ");
		case 12:
			   System.out.println("I AM 12 Case ");
			  
		   
		}
		
		
		
		byte b=10;
		
		switch(b){

		}
		
		char ch='a';
		switch(ch){
				  
		}
		
		//long l=10L;
		//switch(l){
		//}
		

//boolean val=true;
//switch(val){
//}

		byte b2=1;
	    long l1=1L;
	 
		byte b1=99;
		switch(b1+1) {	
		// byte + integer = integer 
		// Implicit type casting 		
		case 11:
			   System.out.println("10");			   
		case 100 :
			   System.out.println("100");		
	    case 1000:
			   System.out.println("1000");			   
		
		}
		// Output : Error/ NoError 
		//How its print all statement
		//sir if we type any number, by default is it int type?
		
//long 1L + 1
// Long + Integer = Long

// byte + 1
// byte + integer = integer 
		
		
//Sir i am still confuse why it 
//sget conveted int int if we add 1 into byte 

	System.out.println("********************");
	int i1=9;
	switch(i1+1) {	//10
	case 10: 
		 System.out.println("10");
	case 10+20:
		 System.out.println("10+20");//30
	case 10+21:
		 System.out.println("10+21");//31 why ? 
	}
	// output ? 	
		
	
	
	//int x1=10;
	//switch(x1){
	  //  case 01:
	       //print 01
	    //case 02 :
	       //print 02
	   // case 01:
	       // print "one" 
	    //case 02 :  
	       // print "two"
	    //case 10 :
	       // print "ten" 

	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}

