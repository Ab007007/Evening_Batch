package com.skillbay.selenium.actitime.autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("IBM Freshers");
		Thread.sleep(5000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@role='presentation']//div[@class='sbl1']/span"));
		
		System.out.println(suggestions.size());
		for (WebElement suggestion : suggestions) 
		{
			System.out.println(suggestion.getText());
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
