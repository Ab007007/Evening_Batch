package com.skillbay.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertsDemo {

	
	
	@Test
	public void sum()
	{
		int a = 10, b = 20;
		SoftAssert sa  = new SoftAssert();
		System.out.println("Summ of 2 numbers...");
		sa.assertEquals((a+b), 31);
		System.out.println("Summ of 2 numbers...");
		sa.assertEquals((a+b), 50);
		System.out.println("Summ of 2 numbers...");
		sa.assertEquals((a+b), 30);
		
		System.out.println("---End ---");
		sa.assertAll();
		
		
	}
}
