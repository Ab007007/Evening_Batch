package com.aim.training.java.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExecptionsDemo2 {

	
	
	public static void main(String[] args) {
		System.out.println("main started");
		File f = new File("fdasfa");
		try {
			FileInputStream fis = new FileInputStream(f);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ended");
	}
}
