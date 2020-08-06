package javaleraning;

public class retrievearrayvalues {

	public static void main(String[] args) {
	/*	int [][]a={{10,20}, {30,40,50}};//Two dimensional array
		for(int i=0; i<a.length;i++){
			for(int j=0; j<a[i].length;j++){
				System.out.println(a[i][j]);
			}
		}*/
     int [][][] a={{{10,20},{30,40,50}},{{60,70,80},{90,100}}};//Three dimenstional array
     for(int i=0;i<a.length;i++){
    	 for(int j=0;j<a[i].length;j++){
    		 for(int k=0;k<a[i][j].length;k++){
    			 System.out.println(a[i][j][k]);
    		 }
    	 }
     }
     
	}

}
