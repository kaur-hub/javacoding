package javaWAP;

public class Swapnum {
	public static void main(String[] args) {
		//with third variable
		/*int a=10; int b=20; int t;
		  t=a;
		   a=b;
		   b=t;
			System.out.println(a);
			System.out.println(b);*/
		//without third variable
		int a=10; int b=20; int t;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
