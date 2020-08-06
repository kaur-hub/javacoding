package javaleraning;

public class Bubblesorting {

	public static void main(String[] args){
		int[] a={36,19,29,12,5};
     int temp = 0;
     for(int i=0;i<a.length;i++){//for rounds
    	 int flag=0;
    	 for(int j=0;j<a.length-1-i;j++){//two adjacent element
    		 if(a[j]>a[j+1]){
    		 temp=a[j];
    		 a[j]=a[j+1];
    		 a[j+1]=temp;
    		 flag=1;
    		 
    		 }
    	 }
    	 
    		if(flag==0){
    	    	 break;
    	 }
   
     }
     for(int i=0;i<a.length;i++){
    	 System.out.println(a[i]+ "");
     
     }



	}

}
