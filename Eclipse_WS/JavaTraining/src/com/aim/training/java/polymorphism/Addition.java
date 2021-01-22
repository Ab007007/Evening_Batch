package com.aim.training.java.polymorphism;

public class Addition {

	static void sum(int a, int b) {
		// System.out.println("The sum of 2 numbers is " + (a+b));
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	static void sum(double a, double b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	public static void main(String[] args) {
		sum(10, 20);
		sum(11, 20);
		sum(12, 20);
		sum(12.5, 55.5);
		sum(22.5,55);
	}

}
