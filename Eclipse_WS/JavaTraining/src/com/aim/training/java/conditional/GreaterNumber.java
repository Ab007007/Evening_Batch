package com.aim.training.java.conditional;

public class GreaterNumber {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 20;

		if (a > b && a > c) {
			System.out.println("First number is greater of three numbers");
		} else if (b > a && b > c) {
			System.out.println("Second number is greater of three numbers");

		} else if (c > a && c > b) {
			System.out.println("Third number is greater of three numbers");

		} else {
			System.out.println("numbers are same");
		}
	}
}
