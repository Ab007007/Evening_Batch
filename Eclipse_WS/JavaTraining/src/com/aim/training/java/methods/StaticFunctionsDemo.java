package com.aim.training.java.methods;

public class StaticFunctionsDemo {

	// Global variables

	// addition
	// substraction
	// multiplication
	// division
	// power of 2

	static int a = 100, b = 50 , c;

	static int addition() {
		c = a + b;
		return c;
	}

	static int substraction() {
		 c = a - b;
		return c;
	}

	static int multiplication() {
		c = a * b;
		return c;
	}

	static int division() {
		c = a / b;
		return c;
	}
	
	
	public static void main(String[] args) {
		int s = addition();
		System.out.println("Sum of two numbers - " + s);
		int su = substraction();
		System.out.println("Sub of two numbers - " + su);
		int mu = multiplication();
		System.out.println("Mul of two numbers - " + mu);
		int di = division();
		System.out.println("Div of two numbers - " + di);
		
		System.out.println("average of 4 " + ((s+su+mu+di)/4));
	}

}
