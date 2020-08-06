package javaleraning;

public class Employee2 {
	 String name;
	int Age;
	//Through constructor
	Employee2(String name,int Age) {
		this.name=name;
		this.Age=Age;
	}

	public static void main(String[] args) {
		Employee2 em=new Employee2("abc",10);
		System.out.println(em.name+"   "+em.Age);

	}

}
