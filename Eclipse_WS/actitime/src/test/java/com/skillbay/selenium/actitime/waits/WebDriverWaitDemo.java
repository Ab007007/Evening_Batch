package com.skillbay.selenium.actitime.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class WebDriverWaitDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("file:///D:/aimorc_training/html/tiimeout.html");
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		
		System.out.println("Demo " + driver.findElement(By.id("demo")).getText());
		System.out.println("Demo2 " + driver.findElement(By.id("demo2")).getText());
	}
}
