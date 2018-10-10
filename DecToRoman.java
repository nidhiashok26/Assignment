import java.util.Scanner;

public class DecToRoman {
	
	public DecToRoman() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a decimal number upto 3000");
		int number = scan.nextInt();
		if ((number>0)&&(number<2999)) {
			
			String thou[]={"","M","MM","MMM"};
			String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
			String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
			String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};

			
			int th=number/1000;
			int h=(number/100)%10;
			int t=(number/10)%10;
			int u=number%10;
			
			System.out.println("Roman Equivalent= "+thou[th]+hund[h]+ten[t]+unit[u]);
		}
		
		else
			System.out.println("Enter valid number");
	}


	public static void main(String[] args) {
		new DecToRoman();

	}

}
