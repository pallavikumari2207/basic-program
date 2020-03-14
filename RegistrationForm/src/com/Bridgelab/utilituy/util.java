package com.Bridgelab.utilituy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class util {
	private static Pattern pattern = null;
	private static Matcher matcher = null;

	
	public static boolean validatePassword(String password) {
		String passwordPattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		pattern = Pattern.compile(passwordPattern);
		matcher = pattern.matcher(password);
		return matcher.matches();
	}

	public static boolean validateName(String name) {
		String patternStr = "^[a-zA-Z]{3,15}$";
		pattern = Pattern.compile(patternStr);
		matcher = pattern.matcher(name);
		return matcher.matches();
	}

	
	public static boolean validateEmail(String email) {
		String patternStr = "^[A-Za-z0-9+_.-]+@(.+)$";
		pattern = Pattern.compile(patternStr);
		matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
