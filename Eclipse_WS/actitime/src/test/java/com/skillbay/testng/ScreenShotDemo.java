package com.skillbay.testng;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotDemo {
	WebDriver driver = null;
	
	@BeforeClass
	public void createDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void closeDriver() {
		driver.close();
	}
	
	
	@Test
	public void loginWithValidCredentials() throws InterruptedException {
		driver.get("http://localhost/login.do");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		
		driver.findElement(By.id("logoutLink")).click();
	}

	
	@Test
	public void loginWithInValidCredentials() throws InterruptedException {
		driver.get("http://localhost/login.do");

		driver.findElement(By.name("username")).sendKeys("admin123");
		driver.findElement(By.name("pwd")).sendKeys("manager123");
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		driver.findElement(By.id("logoutLink")).click();
	}
	
	@AfterMethod
	public void executionstatus(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			captureScreenShot();
		}
		else
		{
			System.out.println(result.getName() + " is passed");
		}
	}
	
	public void captureScreenShot() 
	{
		TakesScreenshot ss  = (TakesScreenshot) driver;
		File screenShot = ss.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("reports/ss_"+ new Date().toString().replace(" ", "_").replace(":", "_") + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
