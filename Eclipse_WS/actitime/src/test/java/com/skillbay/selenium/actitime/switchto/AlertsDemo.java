package com.skillbay.selenium.actitime.switchto;

import org.openqa.selenium.WebDriver;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;
import com.skillbay.selenium.actitime.utils.FileUtils;

public class AlertsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = ActitimeUtils.getDriver(FileUtils.getGlobalData("browser"));
		ActitimeUtils.launch(FileUtils.getGlobalData("url"));
		ActitimeUtils.login(FileUtils.getGlobalData("username"),FileUtils.getGlobalData("password"));
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.validateTitle("actiTIME - Task List");
		
		ActitimeUtils.clickOnCreateCustomerButton();
		ActitimeUtils.type("id", "customerLightBox_nameField", "TEMP");
		ActitimeUtils.type("id","customerLightBox_descriptionField", "TEMP");
		ActitimeUtils.click("id", "customerLightBox_cancelBtn");
		Thread.sleep(2000);
	
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		ActitimeUtils.type("id", "customerLightBox_nameField", "123");
		ActitimeUtils.click("id", "customerLightBox_cancelBtn");
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		ActitimeUtils.logout();

	}
	

}
