package javaWAP;

import java.util.Scanner;

public class factorialbyRecursion {
	 static int fact=1;

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//with userinput
		System.out.println("Enter a number");//with userinput
		int no =scan.nextInt();//with userinput
	//int no=5;//without scanner class
	factorialbyRecursion fr=new factorialbyRecursion();
	 fr.calfact(no);
	 System.out.println(fact);

	}
	void calfact( int no){
		if(no>1){
			fact=fact*no;
			calfact(no-1);
		}
		//return fact;
		
	}

}
