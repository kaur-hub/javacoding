package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HaspMapConcept {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1, "cucumber");
		hm.put(2, "selenium");
		hm.put(3, "Git");
		hm.put(4, "Jenkin");
		hm.put(5, "QC");
	System.out.println("Content of Hashmap:"+hm);
		System.out.println("***************************");
//print all values
		for(Entry<Integer, String> m:hm.entrySet()){
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		System.out.println("***************************");
		hm.remove(3);
		System.out.println(hm);
		System.out.println("***************************");	
// user defined -----Student detail
		  //Creating user-defined class objects  
		HashMap<Integer,Student> stu= new HashMap<Integer,Student>();	
		  Student s1=new Student(101,"Tom",23);  
		  Student s2=new Student(102,"Ravi",21);  
		  Student s3=new Student(103,"Peter",25); 
		  stu.put(1, s1);
		  stu.put(2, s2);
		  stu.put(3, s3);
//Traverse the hashmap
		  for(Entry<Integer,Student>s:stu.entrySet()){
			 int key= s.getKey();
			 Student st=s.getValue();
			 System.out.println(st.name+"  "+st.age+"  "+st.rollno);
		  }
		  
		
		

	}

}
