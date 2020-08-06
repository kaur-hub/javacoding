package javaWAP;

import java.util.Scanner;

public class sumNum {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the numbers");
	 int a= s.nextInt();
	 int b= s.nextInt();
	 for(int i=0;i<b;i++){
		 a++;
	 }
	 System.out.println("Sum of numbers is:"+a);
	}

}
