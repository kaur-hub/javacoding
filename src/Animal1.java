
 class Animal1 {
	void eat(){
		System.out.println("Animals are eating");
	}
	}
	 class Dog1 extends Animal{
		void bark(){
			System.out.println("barking");//single inheritance

		}
	 }
		class Cat extends Animal{
		void play(){
			System.out.println("playing");
		}
}
		 class Dog2 extends Dog1{
				void run(){
					System.out.println("running");
				}}