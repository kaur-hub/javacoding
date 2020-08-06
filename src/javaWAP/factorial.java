package javaWAP;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);//  to get user input 
		System.out.println("Enter a number");
		int a=scan.nextInt();
		//int a=5 ; // without scanner class
		int fact=1;
		for(int i=1;i<=a;i++){
			fact= fact*i;
			//System.out.println(fact);
			
		}
		System.out.println(fact);

	}

}
