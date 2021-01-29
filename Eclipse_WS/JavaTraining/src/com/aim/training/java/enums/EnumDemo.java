package com.aim.training.java.enums;

import java.util.Iterator;

public class EnumDemo {

	enum Season {
		WINTER, SUMMER, RAINY
	}

	public static void main(String[] args) {

		System.out.println(Day.MONDAY);
		for (Season session : Season.values()) {
			System.out.println(session);
		}

		String choice = Season.RAINY.toString();
		switch (choice) {
		case "WINTER":
				System.out.println("Its Winter!! Too Cold");
			break;
		case "SUMMER":
			System.out.println("Its Summer!! Too Hot");
			
			break;
		case "RAINY":
			System.out.println("Its Rainy!! Too Cold");
			
			break;

		default:
			break;
		}

	}
}
