package javaWAP;

public class Primenumber {

	public static void main(String[] args) {
		//int no=7;
		int temp=0;
		for(int i=2;i<=10;i++ ){// start from 2 because 7 is not divisible by 2,3,4,5,6
			if(i%i==0){
				//temp=temp+1;
				i++;
			}
			System.out.println(i);
		

	}

}
}
