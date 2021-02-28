package com.skillbay.testng.js;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {
	WebDriver driver = null;

	@BeforeClass
	public void createDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void javaScriptExecutionTest() throws InterruptedException {
		driver.get("http://formy-project.herokuapp.com/scroll");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0, 1000);");
		js.executeScript("arguments[0].blur();", driver.findElement(By.id("logo")));
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("name")));
	
		
	}

}
