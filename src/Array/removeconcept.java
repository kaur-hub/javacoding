package Array;

import java.util.Arrays;

public class removeconcept {

	public static void main(String[] args) {
		  int [] a={10,20,30,40,50,60};
		    System.out.println("array list"+Arrays.toString(a) );
		   int removeIndex=2;
		   for(int i= removeIndex;i<a.length-1;i++ ){
		       a[i]= a[i+1];
		      // System.out.println("New array list"+Arrays.toString(a) );

	}
		     System.out.println("New array list"+Arrays.toString(a) );

}
}
