package com.aim.training.java.methods;

public class MathematicalOperations {

	// Global variables

	// addition
	// substraction
	// multiplication
	// division
	// power of 2

	int a, b, c;

	void addition() {
		int c = a + b;
		System.out.println("Sum of two numbers is :" + c);
	}

	void substraction() {
		 c = a - b;
		System.out.println("Sub of two numbers is :" + c);
	}

	void multiplication() {
		int c = a * b;
		System.out.println("Mul of two numbers is :" + c);
		System.out.println("Global value of c is : "+ this.c);
	}

	void division() {
		int c = a / b;
		System.out.println("Div of two numbers is :" + c);
	}
	
	
	public static void main(String[] args) {
		MathematicalOperations mo = new MathematicalOperations();
		mo.a = 100;
		mo.b = 50;
		mo.addition();
		mo.substraction();
		mo.multiplication();
		mo.division();
	}

}
