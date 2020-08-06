package javaleraning;

public class Test {
	static{
		System.out.println("static block");
	}
	public static void main(String[]args){
		System.out.println("main method");
	}
	/*static{  //this is possible only till jdk 1.6 ,Since 1.7 it is  not possible to excute a java class without main method
		  System.out.println("static block is invoked");  
		  System.exit(0);  
		  }  */
	
}
