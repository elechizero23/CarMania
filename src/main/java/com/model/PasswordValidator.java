package com.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

	private Pattern pattern;
	private Matcher matcher;

	private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z]).{5,}$";
	
	public PasswordValidator(){
		this.pattern = Pattern.compile(PASSWORD_PATTERN);
	}
	
	public boolean validate(final String password){	
		this.matcher = this.pattern.matcher(password);
		return matcher.matches();	
	}
}
