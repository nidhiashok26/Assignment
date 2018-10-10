import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
	
	public Factorial() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number whose factor is to be found");
			int number = scan.nextInt();
			if(number<0) {
				System.out.println("Please enter positive integers only");
				System.out.println("End of Program");
				System.exit(0);
			}
			
			int i, fact = 1;
			for (i = 1; i <= number; i++)
				fact = fact * i;
			System.out.println("Factorial:" + fact);
		} catch (InputMismatchException e) {
			System.out.println("Please enter positive integers only");
		}finally {
			System.out.println("End of Program");
		}
	}
		


	public static void main(String[] args) {
		new Factorial();

	}

}
