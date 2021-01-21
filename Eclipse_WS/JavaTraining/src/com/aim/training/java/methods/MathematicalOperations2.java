package com.aim.training.java.methods;

public class MathematicalOperations2 {

	// Global variables

	// addition
	// substraction
	// multiplication
	// division
	// power of 2

	int a, b, c;

	public int addition() {
		c = a + b;
		return c;
	}

	public int substraction() {
		 c = a - b;
		return c;
	}

	public int multiplication() {
		c = a * b;
		return c;
	}

	public int division() {
		c = a / b;
		return c;
	}
	
	
	public static void main(String[] args) {
		MathematicalOperations2 mo = new MathematicalOperations2();
		mo.a = 100;
		mo.b = 50;
		int s = mo.addition();
		int su = mo.substraction();
		int mu = mo.multiplication();
		int di = mo.division();
		
		System.out.println("average of 4 " + ((s+su+mu+di)/4));
	}

}
