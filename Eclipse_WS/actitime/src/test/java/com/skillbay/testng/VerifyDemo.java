package com.skillbay.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyDemo {

	
	
	@Test
	public void sum()
	{
		int a = 10, b = 20;
		System.out.println("Summ of 2 numbers...");
		Assert.assertEquals((a+b), 31);
		System.out.println("Summ of 2 numbers...");
		Assert.assertEquals((a+b), 30);
		System.out.println("Summ of 2 numbers...");
		Assert.assertEquals((a+b), 30);
		
		System.out.println("---End ---");
		
		
		
	}
}
