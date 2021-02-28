package com.skillbay.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class DataProviderDemo extends TestData
{

	@Parameters({"url" , "username" , "password"})
	@Test 
	public void readGlobaldata(String appurl, String un, String pwd)
	{
		System.out.println(appurl);
		System.out.println(un);
		System.out.println(pwd);
	}
	@Test(dataProvider = "sampledata")
	public void f(Integer n, String s) {
		System.out.println(n + " ---- " + s);
	}

	
	@Test(dataProvider = "createcustomerdata")
	public void createcustomer(String cn, String cd) {
		System.out.println(cn + " ---- " + cd);
	}
	
	@Test(dataProvider = "createProjectdata", dataProviderClass = TestData.class)
	public void createproject(String cn,String pn, String pd) {
		System.out.println(cn + " ---- " + pn + "----" + pd);
	}
	
	
	
}
