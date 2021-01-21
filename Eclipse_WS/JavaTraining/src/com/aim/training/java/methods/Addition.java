package com.aim.training.java.methods;

public class Addition 
{
	/*
	 * [access specifier] [access modifier] return_type name_of_method([Argument list])
	 * {
	 * 
	 * 
	 * 
	 * }
	 */
	void sum()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		
	}
	static void sum1()
	{
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println(c);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		sum1();
		
	}
}
