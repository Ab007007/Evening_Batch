package com.skillbay.testng;

import org.testng.annotations.Test;

public class OrderOfExecution {

	
	@Test
	public void launch()
	{
		System.out.println("--- Launching application ----");
	}
	
	@Test(dependsOnMethods = "launch")
	public void login()
	{
		System.out.println("--- Login application ----");
	}
	
	@Test(dependsOnMethods = {"launch", "login"})
	public void createCustomer()
	{
		System.out.println("--- Create Customer application ----");
	}
	
	@Test(dependsOnMethods = "createCustomer")
	public void logout()
	{
		System.out.println("--- Logout application ----");
	}
}
