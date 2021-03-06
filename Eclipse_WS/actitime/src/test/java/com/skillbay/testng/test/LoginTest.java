package com.skillbay.testng.test;

import org.testng.annotations.Test;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;
import com.skillbay.testng.page.DashboardPage;
import com.skillbay.testng.page.LoginPage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LoginTest {
	WebDriver driver = null;
	LoginPage lp = null;
	DashboardPage dp = null;
	
	@BeforeClass
	public void setup()
	{
		driver = ActitimeUtils.getDriver("chrome");
		lp = new LoginPage(driver);
		dp = new DashboardPage(driver);
	}
	
	@Parameters({"url"})
	@BeforeMethod
	public void launchApp(String url)
	{
		driver.get(url);
	}
	@Parameters({"username", "password"})
	@Test(priority = 1)
	public void validLogin(String un, String pw) throws InterruptedException
	{
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.clickOnLoginButton();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	}
	
	
	@Parameters({"username", "password"})
	//@Test(priority = 2)
	public void invalidLogin(String un, String pw) throws InterruptedException
	{
		lp.enterUserName(un+"1212");
		lp.enterPassword(pw);
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
