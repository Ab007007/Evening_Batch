package com.skillbay.selenium.actitime.utils;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends WebDriverUtils
{
	
	public static void launch(String url)
	{
		System.out.println("--- Launching Application --- " + url);
		driver.get(url);
	}
	
	public static void login(String un, String pwd)
	{
		System.out.println("--- Loging to the application " + un + " : " + pwd);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void validateAutoSuggestion(String pattern)
	{
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(pattern);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[@id='taskSearchControl']//div[@class='taskList']"))));
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//table[@id='taskSearchControl']//div[@class='templates']/following-sibling::div"));
		
		Iterator<WebElement> it = suggestions.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		
		
	}
}
