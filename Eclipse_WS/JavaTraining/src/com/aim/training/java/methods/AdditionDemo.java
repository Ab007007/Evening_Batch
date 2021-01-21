package com.aim.training.java.methods;

public class AdditionDemo {

	
	public int sum(int a, int b)
	{
		return (a+b);
	}
	
	public double sum(double a, double b)
	{
		return (a+b);
	}
	
	
	public static void main(String[] args) {
		AdditionDemo ad = new AdditionDemo();
		
		int a = ad.sum(20 , 30);
		System.out.println("Sum of two numbers " + a);
		
		double b = ad.sum(25.5, 55.5);
		System.out.println("Sum of two numbers " + b);
		
	}
}
