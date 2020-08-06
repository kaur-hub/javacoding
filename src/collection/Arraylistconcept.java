package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistconcept {
       
	public static void main(String[] args) {
		 int []a=new int[3];
		ArrayList ar=new ArrayList ();// Non Generic because we add any type of data type here
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		ar.add(60);//duplicate element
		ar.add("Hello");
		ar.add('a');
		System.out.println(ar.get(4));//fetch and retrieve element
		
		System.out.println(ar.size());// to get size of array
		for(int i=0; i<ar.size();i++){  //using for loop fetching data from array
			//System.out.println(ar.get(i));
		}
			ArrayList<Integer> ar1=new ArrayList<Integer> ();//Generic 
			//ar1.add(100);
			System.out.println(ar1.add(100));
			//ar1.add("Hello");//here cannot add string this is generic and integer array
			
//How to define user class object in Arraylist//
			Employee e1=new Employee("Rohan",20,"QA");
			Employee e2=new Employee("Gurman",21,"dev");
			Employee e3=new Employee("Ravi",22,"admin");
			ArrayList<Employee> ar2=new ArrayList<Employee> ();
			ar2.add(e1);
			ar2.add(e2);
			ar2.add(e3);
//How to traverse the data we use iterator//
		Iterator<Employee> it=	ar2.iterator();
		while(it.hasNext()){
	Employee emp=it.next();
	System.out.println(emp.name);
	System.out.println(emp.age);
	System.out.println(emp.dept);

		}
		System.out.println("*********************");
		//addAll() method
		ArrayList<String> ar3=new ArrayList<String> ();
			ar3.add("test");
			ar3.add("java");
			ar3.add("selenium");
			ArrayList<String> ar4=new ArrayList<String> ();	
			ar4.add("test");
			ar4.add("QTP");
			ar4.add("QA");
			ar3.addAll(ar4);
			for(int i=0;i<ar3.size();i++){
				
				System.out.println(ar3.get(i));
			}
			System.out.println("**********************");
			//removeAll() method
			ArrayList<String> ar5=new ArrayList<String> ();
			ar5.add("test");
			ar5.add("java");
			ar5.add("selenium");
			ArrayList<String> ar6=new ArrayList<String> ();	
			ar6.add("test1");
			ar6.add("QTP");
			ar6.add("QA");
			ar5.removeAll(ar6);
			for(int i=0;i<ar5.size();i++){
				
				System.out.println(ar5.get(i));
			
		}
			System.out.println("**********************");
     // retainAll() method it choose common value
			ArrayList<String> ar7=new ArrayList<String> ();
			ar7.add("test");
			ar7.add("java");
			ar7.add("selenium");
			ArrayList<String> ar8=new ArrayList<String> ();	
			ar8.add("test");
			ar8.add("QTP");
			ar8.add("QA");
			ar7.retainAll(ar8);
			for(int i=0;i<ar7.size();i++){
				
				System.out.println(ar7.get(i));
			
		

	}
}
}



