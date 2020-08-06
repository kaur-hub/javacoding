package javaWAP;

import java.util.Scanner;

public class SumNumbySwitch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		 int a= s.nextInt();
		 int b= s.nextInt();
		 int sum=a+b;
		System.out.println(sum);
		switch(sum){
		case 1:  sum=a+b;
			System.out.println("Addition of two numbers is: "+sum);
			break;
	
			default:
				System.out.println("invalid res");
			
		}

	}

}
