import java.util.Scanner;

public class Calculator {
	
	double a, b, c;
	
	public Calculator() {
		
		int choice=0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			choice=getChoice(scan);
			
			switch (choice) {
			case 1: 
				a=getFirstNumber(scan);
				b=getSecondNumber(scan);
				add(a,b);
				System.out.println("The sum of "+a+" and "+b+" is "+c);
				break;
			case 2:
				a=getFirstNumber(scan);
				b=getSecondNumber(scan);
				subtract(a,b);
				System.out.println("The difference between "+a+" and "+b+" is "+c);
				break;
			case 3:
				a=getFirstNumber(scan);
				b=getSecondNumber(scan);
				multiply(a,b);
				System.out.println("The product of "+a+" and "+b+" is "+c);
				break;
			case 4:
				a=getFirstNumber(scan);
				b=getSecondNumber(scan);
				divide(a,b);
				System.out.println("The quotient of "+a+" and "+b+" is "+c);
				break;
			case 5:
				System.out.println("Exiting Application. Thank You!");
				System.exit(0);
				break;

			default:
				break;
			}
		}
		
	}
	

	private double divide(double a2, double b2) {
		c=a/b;
		return c;
		
	}


	private double multiply(double a2, double b2) {
		c=a*b;
		return c;
		
	}


	private double subtract(double a2, double b2) {
		c=a-b;
		return c;
		
	}


	private double add(double a2, double b2) {
		c=a+b;
		return c;
		
	}


	private double getSecondNumber(Scanner scan) {

		System.out.println("Enter the second number B");
		b = scan.nextDouble();
		return b;
	}


	private double getFirstNumber(Scanner scan) {
		System.out.println("Enter the first number A");
		a = scan.nextDouble();
		return a;
	}


	private int getChoice(Scanner scan) {
		int choice=0;
		System.out.println("Online Calculator");
		System.out.println("1. Add two numbers (A+B)");
		System.out.println("2. Subtract two numbers (A-B)");
		System.out.println("3. Multiply two numbers (A*B)");
		System.out.println("4. Divide two numbers (A/B)");
		System.out.println("5. Exit Application");
		System.out.println("Enter your choice");
		choice = scan.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		
		new Calculator();
		

	}

}
