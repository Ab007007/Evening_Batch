package com.skillbay.selenium.actitime.tests;

import org.openqa.selenium.WebDriver;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class CreateCustomer
{
	
	public static void main(String[] args) {
		WebDriver driver  = ActitimeUtils.getDriver("ff");
		ActitimeUtils.launch("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.validateTitle("actiTIME - Task List");
		
		ActitimeUtils.clickOnCreateCustomerButton();
		ActitimeUtils.createCustomer("SkillBay-Cust3", "SkillBay-Cust-Desc3");
		ActitimeUtils.logout();
		
	}

	

}
