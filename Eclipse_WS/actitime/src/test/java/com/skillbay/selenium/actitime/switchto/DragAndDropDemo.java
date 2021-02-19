package com.skillbay.selenium.actitime.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class DragAndDropDemo {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'default')]")));
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
		
		driver.switchTo().defaultContent();
		ActitimeUtils.click("linktext", "Sortable");
	}
}
