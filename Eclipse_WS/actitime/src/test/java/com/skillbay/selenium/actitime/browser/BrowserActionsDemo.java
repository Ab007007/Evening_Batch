package com.skillbay.selenium.actitime.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class BrowserActionsDemo {
	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver();
		driver.manage().window().maximize();
		
		
			
		ActitimeUtils.launch("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement srcEle = ActitimeUtils.getElement("id", "draggable");
		WebElement destEle = ActitimeUtils.getElement("id", "droppable");
		System.out.println("--- Before Drag and Drop ---");
		System.out.println(srcEle.getText());
		System.out.println(destEle.getText());
		
		Actions act = new Actions(driver);
		act.dragAndDrop(srcEle, destEle).perform();
		
		System.out.println("--- After Drag and Drop ---");
		System.out.println(srcEle.getText());
		System.out.println(destEle.getText());
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
