import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber{    
 
	public static void main(String args[]){    
		try {
			int i,m=0,flag=0;      
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number whose factor is to be found");
		int n = scan.nextInt();  
		if(n<0) {
			System.out.println("Please enter positive integers only");
			System.out.println("End of Program");
			System.exit(0);
		}
		m=n/2;      
		if(n==0||n==1){  
			System.out.println(n+" is not prime number");      
		}
		else{  
			for(i=2;i<=m;i++){      
				if(n%i==0){      
					System.out.println(n+" is not prime number");      
					flag=1;      
					break;      
    		}      
    	}      
    	if(flag==0)  { System.out.println(n+" is prime number"); }  
    	}  
		
		} catch (InputMismatchException e) {
			System.out.println("Please enter positive integers only");
		}finally {
			System.out.println("End of Program");
		}
	}
}
