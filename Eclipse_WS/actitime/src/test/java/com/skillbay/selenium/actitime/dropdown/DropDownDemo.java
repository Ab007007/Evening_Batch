package com.skillbay.selenium.actitime.dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

import sun.nio.ch.SelChImpl;

public class DropDownDemo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/form");
		
		Select sel = new Select(ActitimeUtils.getElement("id", "select-menu"));
		
		sel.selectByIndex(4);
		Thread.sleep(3000);
		
		sel.selectByValue("2");
		Thread.sleep(3000);
		
		sel.selectByVisibleText("5-9");
		Thread.sleep(3000);
		
		driver.close();
	
	}
	

}
