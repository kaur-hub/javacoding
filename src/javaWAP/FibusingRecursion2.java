package javaWAP;

public class FibusingRecursion2 {
	int a=0;  int b=1; int c;
	public static void main(String[] args) {
		FibusingRecursion2  fr=new FibusingRecursion2() ;
		fr.printFib(10);
	
	}
	public void printFib( int i){
		if(i>=1){
			c=a+b;
			a=b;
			b=c;
			System.out.println(""  +c);
			printFib(i-1);
		}
		
	}

}
