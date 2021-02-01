package com.aim.training.java.exceptions;

public class RunTimeExceptionDemo {

	
	public static void main(String[] args) {
		System.out.println("--main started--");
		String names[] = new String[2];
		String myName = "";
		try {
			names[0] = "ABC";
			names[1] = "PQR";
			try {
				names[2] = "XYZ";
			}
			catch(Exception ex)
			{
				System.out.println("my first catch");
			}
			System.out.println(myName.length());
			System.out.println(myName.charAt(1));
			
			
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Please check the array size" + ex.getMessage());
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("Please check the value assigned");
		}
		catch(NullPointerException ex)
		{
			System.out.println("String doesn't have value assigned");
		}
		
		
		for (String name : names)
		{
			System.out.println(name);
		}
		System.out.println("--main ended--");
	}
}
