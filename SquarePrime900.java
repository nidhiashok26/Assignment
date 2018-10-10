
public class SquarePrime900 {

	public SquarePrime900() {
		int n=1,square;
		int max = 900;
		int i,m=0,flag=0; 
		
		for(n=2;n<=30;n++) {	
			checkPrime(n);
		}
	}
	private void checkPrime(int n) {
		int m=0,flag=0,i;
		m=n/2;      

			for(i=2;i<=m;i++){      
				if(n%i==0){       
					flag=1;      
					break;      
    		}      
    	}      
    	if(flag==0)  { System.out.println(n*n); }  
    	}
		
	public static void main(String[] args) {
		new SquarePrime900();

	}

}
