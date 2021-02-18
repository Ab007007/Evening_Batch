package com.skillbay.selenium.actitime.tests;

import org.openqa.selenium.WebDriver;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;
import com.skillbay.selenium.actitime.utils.FileUtils;

public class CreateMultipleCustomer
{
	
	public static void main(String[] args) {
		
		WebDriver driver  = ActitimeUtils.getDriver(FileUtils.getGlobalData("browser"));
		String cn,cd;
		String sheet_name = "create_customer";
		ActitimeUtils.launch(FileUtils.getGlobalData("url"));
		ActitimeUtils.login(FileUtils.getGlobalData("username"),FileUtils.getGlobalData("password"));
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.validateTitle("actiTIME - Task List");
		
		int rowCount = FileUtils.getRowCount(sheet_name);
		for( int index = 1; index < rowCount ; index++)
		{
			cn = FileUtils.getCellValue(sheet_name, index, 0);
			cd = FileUtils.getCellValue(sheet_name, index, 1);
			
			ActitimeUtils.clickOnCreateCustomerButton();
			ActitimeUtils.createCustomer(cn,cd);
			
		}
		
		ActitimeUtils.logout();
		
	}

	

}
