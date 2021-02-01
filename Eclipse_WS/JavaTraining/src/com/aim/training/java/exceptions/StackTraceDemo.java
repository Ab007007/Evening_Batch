package com.aim.training.java.exceptions;

public class StackTraceDemo {
	
	public static void main(String[] args) {
		System.out.println("---main started---");
		test1();
		System.out.println("---main ended---");
	}

	public static void test1()
	{
		System.out.println("---test1 started---");
		test2();
		System.out.println("---test1 ended---");
	}
	
	public static void test2()
	{
		System.out.println("---test2 started---");
		test3();
		System.out.println("---test2 ended---");
	}
	
	public static void test3()
	{
		System.out.println("---test3 started---");
		try {
			String str = "";
			System.out.println(str.charAt(1));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		System.out.println("---test3 ended---");
	}
}
