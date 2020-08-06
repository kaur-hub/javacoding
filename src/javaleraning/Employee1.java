package javaleraning;

public class Employee1 {
  String name;
  int age;
  public void get(String s,int a){    // Through methods
	  name=s;
	  age=a;
  }
  public void display(){
	  System.out.println(name +"  "+age);
  }
	public static void main(String[] args) {
		Employee1  e =new Employee1();
		e.get("Rohan", 20);
		e.display();
		

	}

}
