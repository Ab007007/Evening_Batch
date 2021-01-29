package com.aim.training.java.string;

public class StringDemo {

	
	public static void main(String[] args)
	{
		String str1 = "ABC";	//string literal
		
		
		String str2 = new String("ABC"); 	//string Object
		
		str2 = str2.concat("123");
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
