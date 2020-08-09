package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExpDemo1 {

	public static void main(String[] args) {

		System.out.println(Pattern.matches(".m", "2m"));
		System.out.println(Pattern.matches(".m", "2mm"));
		System.out.println(Pattern.matches(".x", "mk"));
		System.out.println(Pattern.matches("..x", "mkx"));
		System.out.println(Pattern.matches("x..", "xkm"));
		System.out.println(Pattern.matches("x.", "xT"));
		System.out.println(Pattern.matches(".x.", "nxT"));
		
		System.out.println(Pattern.matches("[xyz]", "x"));
		System.out.println(Pattern.matches("[xyz]?", "xx"));
		System.out.println(Pattern.matches("[xyz]?", ""));
		
		System.out.println(Pattern.matches("[a-z]+", "abz"));
		System.out.println(Pattern.matches("[A-Z]+", "PKG"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "pK1"));
		
		
		//WA pattern that accept alphanumeric values
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "amitsingh1981"));
		
		//WA pattern that accept alphanumeric characters but only of length 10
		System.out.println(Pattern.matches("[a-zA-Z0-9]{10}", "amitsingh1"));
		
		//WA pattern for firstname where only small alphabets are allowed upto 6 char
		String firstName = "johnmn";
		System.out.println(Pattern.matches("[a-z]{6}", firstName));
		
		//WA pattern for email where only small alphabets with number upto 15 char
		String email = "joh8mngmailmcm";
		System.out.println(Pattern.matches("[a-z0-9]{0,15}", email));
		
		//WA pattern for email where only small alphabets with number and @ special allowed upto 15 char
		String email1 = "jo8mn@gmail.com";
		System.out.println(Pattern.matches("[a-z0-9]+(.+)@(.+)", email1));
		
	
		//collect firstname and lastname  pattern evaluation
		//entered email is valid or not valid
		
	}

}
