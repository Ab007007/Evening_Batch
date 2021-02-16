package com.skillbay.selenium.actitime.tests;

import org.openqa.selenium.WebDriver;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;
import com.skillbay.selenium.actitime.utils.FileUtils;

public class CreateMultipleCustomer
{
	
	public static void main(String[] args) {
		
		WebDriver driver  = ActitimeUtils.getDriver(FileUtils.getGlobalData("browser"));
		ActitimeUtils.launch(FileUtils.getGlobalData("url"));
		ActitimeUtils.login(FileUtils.getGlobalData("username"),FileUtils.getGlobalData("password"));
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.validateTitle("actiTIME - Task List");
		
		ActitimeUtils.clickOnCreateCustomerButton();
		ActitimeUtils.createCustomer("SkillBay-Cust3", "SkillBay-Cust-Desc3");
		ActitimeUtils.logout();
		
	}

	

}
