package com.aim.training.java.string;

public class ReverseString {
	
	public static void main(String[] args) {
		String email = "aru03.info@gmail.com";
		
		for (int i = email.length()-1; i >=0 ; i--) 
		{
			System.out.print(email.charAt(i));
		}
	}

}
