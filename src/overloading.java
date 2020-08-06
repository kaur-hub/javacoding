
public class overloading {
	public void add(){
		System.out.println("i am in main");
	}
	public void add(int a,int b){
		System.out.println(a+b);
	}
	public  void add(int a){
		System.out.println(a);
	}
	public static void main(String[] args) {
	overloading o=new overloading();
	o.add();
	o.add(10, 20);
	o.add(30);
	

	}

}
