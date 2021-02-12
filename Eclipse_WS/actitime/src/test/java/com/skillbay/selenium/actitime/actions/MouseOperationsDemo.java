package com.skillbay.selenium.actitime.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class MouseOperationsDemo {

	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ActitimeUtils.getElement("xpath", "//button[@class='_2KpZ6l _2doB4z']")));
		
		ActitimeUtils.click("xpath", "//button[@class='_2KpZ6l _2doB4z']");
		
			
		String strFashion = "Fashion", strElectronics = "Electronics",
				strHome = "Home" , strAppliences = "Appliances";   //div[text()='Fashion']
		
		Actions act  = new Actions(driver);
		
		act.moveToElement(ActitimeUtils.getElement("xpath", "//div[text()='"+strFashion+"']")).perform();
		Thread.sleep(2000);
		printItems(driver);
		act.moveToElement(ActitimeUtils.getElement("xpath", "//div[text()='"+strElectronics+"']")).perform();
		Thread.sleep(2000);
		printItems(driver);
		act.moveToElement(ActitimeUtils.getElement("xpath", "//div[text()='"+strHome+"']")).perform();
		Thread.sleep(2000);
		printItems(driver);
		act.moveToElement(ActitimeUtils.getElement("xpath", "//div[text()='"+strAppliences+"']")).perform();
		Thread.sleep(2000);
		printItems(driver);
		
	}

	private static void printItems(WebDriver driver) {
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='_2IjXr8']//a"));
		for (WebElement item : items) {
			System.out.println(item.getText());
		}
	}
}
