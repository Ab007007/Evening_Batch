package com.aim.training.java.exceptions;

public class CheckedExceptionsDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		try {
			test();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Main ended");
		
	}
	
	public static void test() throws Exception
	{
		System.out.println("my test method");
	}

}
