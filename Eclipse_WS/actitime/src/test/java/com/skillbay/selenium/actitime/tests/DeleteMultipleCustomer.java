package com.skillbay.selenium.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;
import com.skillbay.selenium.actitime.utils.FileUtils;

public class DeleteMultipleCustomer {

	
	public static void main(String[] args) throws InterruptedException {
		String sheetname = "delete_customer",cn;
		WebDriver driver  = ActitimeUtils.getDriver(FileUtils.getGlobalData("browser"));
		ActitimeUtils.launch(FileUtils.getGlobalData("url"));
		ActitimeUtils.login(FileUtils.getGlobalData("username"),FileUtils.getGlobalData("password"));
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.validateTitle("actiTIME - Task List");
		
		int rowCount = FileUtils.getRowCount(sheetname);
		
		for (int i = 1; i < rowCount; i++)
		{
			cn = FileUtils.getCellValue(sheetname, i, 0);
			
			driver.findElement(By.xpath("//div[@id='cpTreeBlock']//input")).sendKeys(cn);
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//div[@class='node allCustomersNode selected']/following-sibling::div"))).perform();
			Thread.sleep(2000);
			act.click(driver.findElement(By.xpath("//div[@class='node allCustomersNode selected']/following-sibling::div/div[@class='editButton available']"))).perform();
		
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='ACTIONS']"))));

			driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='ACTIONS']")).click();
			
			driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='Delete']")).click();
			
			driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			
			ActitimeUtils.validateSussessMessage();
			
			driver.findElement(By.xpath("//div[@id='cpTreeBlock']//input")).clear();
			
			
		}
		
		
		
		
		
		ActitimeUtils.logout();
	
	
	}
}
