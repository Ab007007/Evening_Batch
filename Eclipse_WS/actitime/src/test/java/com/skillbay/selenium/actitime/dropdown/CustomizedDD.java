package com.skillbay.selenium.actitime.dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class CustomizedDD {

	
	
	public static void main(String[] args) {
		
		WebDriver driver =  ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.click("xpath", "//div[@class='userNameWrapper']");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ActitimeUtils.getElement("xpath", "//div[@class='x-combo-list-inner']")));
	
		ActitimeUtils.click("xpath", "//span[text()='Kloss, Barbara']");
		
		//driver.close();
	
	}
}
