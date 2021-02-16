package com.skillbay.selenium.actitime.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;
import com.skillbay.selenium.actitime.utils.FileUtils;

public class DeleteCustomer {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = ActitimeUtils.getDriver(FileUtils.getGlobalData("browser"));
		ActitimeUtils.launch(FileUtils.getGlobalData("url"));
		ActitimeUtils.login(FileUtils.getGlobalData("username"),FileUtils.getGlobalData("password"));
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.validateTitle("actiTIME - Task List");
		
		ActitimeUtils.type("xpath", "//div[@id='cpTreeBlock']//input", "SkillBay-Cust3");
		
		Actions act = new Actions(driver);
		act.moveToElement
		(ActitimeUtils.getElement("xpath", "//div[@class='node allCustomersNode selected']/following-sibling::div")).perform();
		Thread.sleep(2000);
		act.click(ActitimeUtils.getElement("xpath", "//div[@class='node allCustomersNode selected']/following-sibling::div/div[@class='editButton available']")).perform();
		
		
		ActitimeUtils
		.waitAndclick("xpath", "//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='ACTIONS']");
		
		ActitimeUtils
		.click("xpath", "//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='Delete']");
		
		ActitimeUtils
		.click("id", "customerPanel_deleteConfirm_submitTitle");
		
		ActitimeUtils
		.validateSussessMessage();
		
		ActitimeUtils.logout();
	
	
	}
}
