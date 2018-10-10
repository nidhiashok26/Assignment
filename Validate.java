import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
	Pattern pattern;
	Matcher matcher;
	String regex = "^(\\d{3}-?\\d{2}-?\\d{4})$";
	public Validate() {
		pattern = Pattern.compile(regex);
	}
	private boolean validate(String input) {
		matcher = pattern.matcher(input);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Validate nv = new Validate();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ID");
		String input = scan.nextLine();
		boolean valid = nv.validate(input);
		System.out.println("Input valid: " + valid);
		System.out.println("Enter password");
		String password = scan.nextLine();
		ValidatePW nvPW = new ValidatePW();
		boolean validPW = nv.validatePW(password);
		System.out.println("Input valid: " + valid);
	}
	private boolean validatePW(String password) {
		matcher = pattern.matcher(password);
		return matcher.matches();
	}

}