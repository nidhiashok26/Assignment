import java.util.ArrayList;

public class SumAtPrime {
	int j=0;
	Integer [] intArray = {3,5,6,12,9,8,34,5,75,213,34,24,34,567,234,56,34,23};
	Integer[] intPrime = new Integer[7];
	
	public SumAtPrime() {
		int sum=0, length;
		printArray(intArray);
		int n=0;
		int j=0;
		for(n=0;n<=intArray.length;n++) {	
			checkPrime(n);
		}
		System.out.println();
		printArray(intPrime);
	
		
		for (j=0;j<intPrime.length;j++)
			sum = sum + intPrime [j];
			System.out.println("sum :" +sum );
			
		}

	
	
	private <E> void printArray(E[] elemArray) {
		for (E elem : elemArray) {
			System.out.print(elem + " ");
		}
	}
	
		private void checkPrime(int n) {
		int m=0,flag=0,i;
		m=n/2; 
		
		if(n==0||n==1){  
			flag=1;//System.out.println(n+" is not prime number");      
		}

			for(i=2;i<=m;i++){      
				if(n%i==0){       
					flag=1;
					//System.out.println(n+" is not prime number");
					break;      
    		}      
    	}      
    	if(flag==0)  {
    		intPrime [j] = intArray [n];
    		j++;
    	}
    	 } 

	public static void main(String[] args) {
	  new SumAtPrime();
	}
}
