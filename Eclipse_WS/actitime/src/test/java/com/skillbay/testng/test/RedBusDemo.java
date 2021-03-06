package com.skillbay.testng.test;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class RedBusDemo {

	
	
	@Test
	public void redBusTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeOptions options =  new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		ActitimeUtils.driver = driver;
		ActitimeUtils.launch("https://www.redbus.in/");
		Thread.sleep(3000);
		ActitimeUtils.click("xpath", "//a[text()='BUS HIRE ']");
		
		WebElement ele = ActitimeUtils.getElement("tagname", "object");
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		js.executeScript("return (arguments[0].contentDocument.getElementsByClassName('OutstationComponent__container___17PTB')[0]).click();", ele);
		Thread.sleep(3000);
		js.executeScript("return (arguments[0].contentDocument.getElementById('locationTextFieldLocal').value = \"Bangalore Railway Station Back Gate, M.G. Railway Colony, Majestic, Bengaluru, Karnataka\" );", ele);
		Thread.sleep(3000);
		js.executeScript("return (arguments[0].contentDocument.getElementById('local_dest_name').value = \"Goa Velha, Goa, India\" );", ele);
		Thread.sleep(3000);
		js.executeScript("return (arguments[0].contentDocument.getElementById('proceedButtonOutstation')).click();", ele);
		
				
		
	
	
	
	
	
	
	
	
	}
}
