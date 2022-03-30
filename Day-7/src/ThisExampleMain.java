
public class ThisExampleMain extends SuperExample {

	public static void main(String[] args) {
		 
		ThisExample thisExample = new ThisExample();
	
		System.out.println("*******I am from child/curent class");
		System.out.println(thisExample.marks);
		System.out.println(thisExample.isPass);
		System.out.println(thisExample.stuName);
		
		System.out.println("*******I am from parent class");
		SuperExample superExample= new SuperExample();
		System.out.println(superExample.isPass);
		System.out.println(superExample.marks);
		System.out.println(superExample.stuName);
		
		
	}
}
