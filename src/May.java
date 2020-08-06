import java.util.Scanner;

public class May {

	
		  public static void main(String[] args) {
		  int sum=0;
		 int rem = 0;
		 int n;
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter a number");
		  n=s.nextInt();
		  
		  while(n!=0)
		  {
		    rem=n%10;
		    sum=sum+rem;
		    n=n/10;
		    
			  
		  }
		 System.out.print(sum);
		 }
		}
	


