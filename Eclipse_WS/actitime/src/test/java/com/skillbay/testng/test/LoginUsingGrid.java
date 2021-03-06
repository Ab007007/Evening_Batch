package com.skillbay.testng.test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.skillbay.testng.page.DashboardPage;
import com.skillbay.testng.page.LoginPage;

public class LoginUsingGrid {
	WebDriver driver = null;
	LoginPage lp = null;
	DashboardPage dp = null;
	
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		//driver = ActitimeUtils.getDriver("chrome");
		String nodeUrl = "http://192.168.1.104:5555/wd/hub";
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.addArguments("disable-infobars");
		driver = new RemoteWebDriver(new URL(nodeUrl),options);
		
		
		lp = new LoginPage(driver);
		dp = new DashboardPage(driver);
	}
	
	
	@BeforeMethod
	public void launchApp()
	{
		driver.get("http://localhost/login.do");
	}

	@Test(priority = 1)
	public void validLogin() throws InterruptedException
	{
		lp.enterUserName("admin");
		lp.enterPassword("manager");
		lp.clickOnLoginButton();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	}
	
	

	//@Test(priority = 2)
	public void invalidLogin() throws InterruptedException
	{
		lp.enterUserName("admin");
		lp.enterPassword("manager1");
		lp.clickOnLoginButton();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	}
	
	@AfterMethod
	public void logout(ITestResult result)
	{
		if(result.getStatus() ==ITestResult.FAILURE)
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
		else
		{
			dp.logout();
		}
	}
	@AfterClass
	public void cleanUp()
	{
		driver.close();
	}

}
