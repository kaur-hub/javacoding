package Array;

public class maxnumarray {

	public static void main(String[] args) {
		int []a={4,8,0,5,3,9};
		int max = a[0];
		for(int i=1;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}

		}
		System.out.println(max);
			
		

			
		

	}

}
