import java.util.Scanner;

public class NumberUtil {
	
	double a, b, c,d,e;
	
	public NumberUtil() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			a=getFirstNumber(scan);
			b=getSecondNumber(scan);
			c=getSqNumber(scan);
			multiply(a,b);
			square(c);
		}
	}
	
	private double getSqNumber(Scanner scan) {
		System.out.println("Enter the number to be squared");
		d = scan.nextDouble();
		return b;
	}


	private void multiply(double a2, double b2) {
		c=a*b;
		System.out.println("The product of "+a+" and "+b+" is "+c);	
	}
	
	private void square(double a2) {
		e=d*d;
		System.out.println("The square of "+c+" is "+e);	
	}
	
	private double getSecondNumber(Scanner scan) {

		System.out.println("Enter the second number B to be multiplied");
		b = scan.nextDouble();
		return b;
	}


	private double getFirstNumber(Scanner scan) {
		System.out.println("Enter the first number A to be multiplied");
		a = scan.nextDouble();
		return a;
	}


	

	public static void main(String[] args) {
		new NumberUtil();
	}
}

