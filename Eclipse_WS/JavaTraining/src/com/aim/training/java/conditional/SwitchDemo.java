package com.aim.training.java.conditional;

public class SwitchDemo {

	public static void main(String[] args) {

		String choice = "F";
		switch (choice) {
		case "A":
			System.out.println("Executing A Block");
			break;
		case "B":
			System.out.println("Executing B Block");
			break;
		case "C":
			System.out.println("Executing C Block");
			break;
		case "D":
			System.out.println("Executing D Block");
			break;

		default:
			System.out.println("Invalid choice");
			break;
		}
	}
}
