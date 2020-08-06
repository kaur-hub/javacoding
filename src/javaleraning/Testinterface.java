package javaleraning;

//Multiple inheritance

public class Testinterface implements printable,showable {
	public void show(){
		System.out.println("Hello");
	}
	public void print(){
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		Testinterface t= new Testinterface();
	 t.show();
	 t.print();

	}

}
