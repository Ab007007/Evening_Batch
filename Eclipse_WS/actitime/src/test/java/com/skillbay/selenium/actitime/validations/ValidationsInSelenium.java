package com.skillbay.selenium.actitime.validations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class ValidationsInSelenium {

	
	public static void main(String[] args) {
		WebDriver driver  = ActitimeUtils.getDriver("ff");
		ActitimeUtils.launch("http://formy-project.herokuapp.com/enabled");
		
		WebElement disabledEle = ActitimeUtils.getElement("id", "disabledInput");
		WebElement enabledEle = ActitimeUtils.getElement("id", "input");
		
		
		System.out.println(disabledEle.isDisplayed());
		System.out.println(disabledEle.isEnabled());
		System.out.println(disabledEle.isSelected());
		
		
		System.out.println(enabledEle.isDisplayed());
		System.out.println(enabledEle.isEnabled());
		System.out.println(enabledEle.isSelected());
		
		
		
		
	}
}
