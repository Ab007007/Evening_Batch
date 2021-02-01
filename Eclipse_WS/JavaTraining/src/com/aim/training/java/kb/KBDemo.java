package com.aim.training.java.kb;

import java.util.Scanner;

public class KBDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter secound number");
		int b = sc.nextInt();
		
		System.out.println("Sum of two numbers is " + (a+b));
	}

}
