package com.aim.training.java.variables;

public class VariablesDemo {

	static double salary;

	public static void main(String[] args) {

		System.out.println("--- Main Started ---");
		String name = "Aravinda";
		int age=30;
		double height = 5.8;
		double weight = 72;
		String country = "India";
		System.out.println(age);
		System.out.println(salary);
		test();

		System.out.println("--- Main Ended ---");
	}

	public static void test() {
		System.out.println("test function");
		System.out.println(salary);
		//System.out.println(age);
	}
}