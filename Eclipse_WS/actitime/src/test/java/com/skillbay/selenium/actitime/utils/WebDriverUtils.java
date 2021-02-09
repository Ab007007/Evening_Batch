package com.skillbay.selenium.actitime.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {
	
	public static WebDriver driver = null;
	
	public static WebDriver getDriver()
	{
		System.out.println("--- Creating chrome driver Object ---");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	

}
