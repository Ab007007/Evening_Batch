package com.skillbay.selenium.actitime.dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class CalendarDemo {

	
	public static void main(String[] args) {
		int date = 11;
		
		WebDriver driver =ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/form");
		ActitimeUtils.click("id", "datepicker");
		
		ActitimeUtils.click("xpath", "//td[(@class='day' or @class='today day') and text()='" + date + "' ]");

	
		System.out.println("Hello " + date);
	}
}
