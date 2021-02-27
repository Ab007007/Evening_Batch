package com.aim.training.java.io;

import java.util.Date;

public class DateDemo {

	
	public static void main(String[] args) {
		
		System.out.println(new Date().toString().replace(" ", "_").replace(":", "_"));
	}
}
