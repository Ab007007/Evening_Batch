package com.skillbay.selenium.actitime.tests;

import org.openqa.selenium.WebDriver;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class FormyRegistrationPage {

	public static void main(String[] args) {

		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/form");
		ActitimeUtils.type("id", "first-name", "Aravinda");
		ActitimeUtils.type("id", "last-name", "HB");
		ActitimeUtils.type("id", "job-title", "Trainer");
		ActitimeUtils.click("id", "radio-button-3");
		ActitimeUtils.click("id", "checkbox-1");
		ActitimeUtils.click("xpath", "//a[text()='Submit']");
		
		

	}
}
