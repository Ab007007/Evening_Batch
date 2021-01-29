package com.aim.training.java.string;

public class ReverseWord {
	
	public static void main(String[] args) {
		String sentence = "Hello All, Java is Easy programming language"
				+ "compared to other programming language";
		
		String[] words = sentence.split(" ");
		
		System.out.println("Total words " + words.length);
		
		for (String word : words) {
			
			for (int i = word.length()-1; i >=0 ; i--) 
			{
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
		
		
	}

}
