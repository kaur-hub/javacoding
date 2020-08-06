package javaWAP;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the mode of transport; option are car, bus scooter");
		String name=sc.nextLine();
	
		
	switch (name) {
	case "car":System.out.println("reach office by 15 min");
		
		break;
	case "Aeroplane":System.out.println("reach office by 15 min");

	default:
		break;
	}

}}
