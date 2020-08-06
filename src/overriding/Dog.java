package overriding;

public class Dog extends Animal{
	public void run(){
		System.out.println("Dog is running");
	}
	public void show(){
	   run();
	   super.run();
	}


	public static void main(String[] args) {
	Dog b= new Dog();
	b.show();
	
	
  

	}

}
