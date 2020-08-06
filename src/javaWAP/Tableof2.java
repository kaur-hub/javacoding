package javaWAP;

import java.util.Scanner;

public class Tableof2 {

	public static void main(String[] args) {
		//without using scanner
	/*	int no =2;
		for(int i=1;i<=10; i++){
			System.out.println(no*i);
		}*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a nmumber");
		int no=scan.nextInt();
		
		for(int i=1;i<=10; i++){
			System.out.println(no*i);

	}

}
}
