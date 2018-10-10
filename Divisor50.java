
public class Divisor50 {
	
	public Divisor50() {
		for(int n=1; n<=50;n++) {
			if ((50%n)==0)
				System.out.println(n);
		}
			
	}

	public static void main(String[] args) {
		new Divisor50();
	}

}
