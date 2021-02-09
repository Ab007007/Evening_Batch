package com.skillbay.selenium.actitime.autosuggestions;

import org.openqa.selenium.WebDriver;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;
import com.skillbay.selenium.actitime.utils.WebDriverUtils;

public class ValidateAutoSuggestions  
{
	
	public static void main(String[] args) {
		
		WebDriver driver = null;
		driver = ActitimeUtils.getDriver();
		
		ActitimeUtils.launch("http://localhost/login.do");
		
		ActitimeUtils.login("admin", "manager");
		
		ActitimeUtils.validateAutoSuggestion("D");
		
		driver.close();
		
		
	}
}
