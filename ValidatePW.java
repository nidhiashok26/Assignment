import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePW {
	Pattern pattern;
	Matcher matcher;
	String regex1 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[#$%^&*])(?=\\\\S+$).{8,}$";
	public ValidatePW() {
		pattern = Pattern.compile(regex1);
	}

}
