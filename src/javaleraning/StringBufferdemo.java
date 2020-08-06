package javaleraning;

public class StringBufferdemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("deepak");
		  sb=sb.append("java");//error because of  final modifier,we cannot resign object 
		//
		 sb.append("java");//without assigning new object we can make changes directly
		  System.out.println(sb);

	}

}
