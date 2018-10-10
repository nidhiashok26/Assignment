package com.deloitte;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JA17Regex {
	
	Pattern pattern;
	Matcher matcher;
	String regex="^(\\d{3}-\\d{2}-\\d{4})$";
	
	public JA17Regex() {
		pattern = Pattern.compile(regex);
	}

	boolean validate(String input) {
		matcher = pattern.matcher(input);
		return matcher.matches();
	}
	
	}

	


