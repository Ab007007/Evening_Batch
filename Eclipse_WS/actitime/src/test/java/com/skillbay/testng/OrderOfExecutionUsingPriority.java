package com.skillbay.testng;

import org.testng.annotations.Test;

public class OrderOfExecutionUsingPriority {

	
	@Test(priority = 1)
	public void launch()
	{
		System.out.println("--- Launching application ----");
	}
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("--- Login application ----");
	}
	
	@Test(priority = 3)
	public void createCustomer()
	{
		System.out.println("--- Create Customer application ----");
	}
	
	@Test(priority = 4)
	public void logout()
	{
		System.out.println("--- Logout application ----");
	}
}
