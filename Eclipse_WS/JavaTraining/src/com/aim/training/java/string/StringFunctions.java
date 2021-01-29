package com.aim.training.java.string;

public class StringFunctions {
	
	public static void main(String[] args) {
		String email = "aru03.info@gmail.com";
		
		System.out.println("Length " + email.length());
		System.out.println("Char at index " + email.charAt(0));
		
		System.out.println("Index of char " + email.indexOf("a"));
		
		System.out.println("Last index of char " + email.lastIndexOf("a"));
		
		System.out.println("content equals " + email.contentEquals("aru03.info@gmail.com"));
		
		System.out.println("equals " + email.equals("Aru03.info@gmail.com"));
		
		System.out.println("Equals ignore case " + email.equalsIgnoreCase("Aru03.info@gmail.com"));
		
		System.out.println("Substring " + email.substring(0, 10));
		
		System.out.println(email.toUpperCase());
		
		System.out.println(email.toLowerCase());
		
		
		
		
		String[] junk = email.split("\\.");
		for (String str : junk) {
			System.out.println(str);
			
		}
		
		System.out.println(email.isEmpty());
		
		
		
		
		
		
		
	}

}
