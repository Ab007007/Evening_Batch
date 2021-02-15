package com.skillbay.selenium.actitime.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {

	public static WebDriver driver = null;

	public static WebDriver getDriver() {
		System.out.println("--- Creating chrome driver Object ---");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver getDriver(String type)
	{
		System.out.println("--- Creating Driver to " + type + " browser");
		switch (type) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "ff" :
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge" :
			WebDriverManager.edgedriver().setup();
			driver =  new EdgeDriver();
		default:
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	
	
	
	
	
	
	

	/***
	 * @description - This method returns webelement,
	 * @author Aravind
	 * @param identifier - id, name, classname, tagname, linktext, partiallinktext,
	 *                   css, xpath
	 * @param value      - corresponding value for an identifier
	 * @return
	 */
	public static WebElement getElement(String identifier, String value) {
		System.out.println("--- Finding Element using " + identifier + " and " + value + " ---");
		WebElement ele = null;

		switch (identifier.toLowerCase()) {
		case "id":
			ele = driver.findElement(By.id(value));
			break;

		case "name":
			ele = driver.findElement(By.name(value));
			break;

		case "classname":
			ele = driver.findElement(By.className(value));
			break;

		case "linktext":
			ele = driver.findElement(By.linkText(value));
			break;

		case "tagname":
			ele = driver.findElement(By.tagName(value));
			break;

		case "partiallinktext":
			ele = driver.findElement(By.partialLinkText(value));
			break;

		case "css":
			ele = driver.findElement(By.cssSelector(value));
			break;

		case "xpath":
			ele = driver.findElement(By.xpath(value));
			break;

		default:
			break;
		}
		return ele;
	}

	public static void type(String identifier, String value, String text)
	{
		System.out.println("### Performing type operation ###" + text);
		getElement(identifier, value).sendKeys(text);
	}
		
	public static void click(String identifier, String value)
	{
		System.out.println("$$$ Performing click operation $$$");
		getElement(identifier, value).click();
	}
	
}
