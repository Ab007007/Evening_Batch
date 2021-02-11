package com.skillbay.selenium.actitime.dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class MultiSelectDropDown {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("file:///D:/aimorc_training/html/multiSelect.html");
		
		Select sel = new Select(ActitimeUtils.getElement("tagname", "select"));
		
		sel.selectByIndex(3);
		Thread.sleep(3000);
		
		sel.selectByValue("saab");
		Thread.sleep(3000);
		
		sel.selectByVisibleText("Mercedes");
		Thread.sleep(3000);
		sel.selectByIndex(0);
		Thread.sleep(3000);
		
		
		sel.deselectByVisibleText("Volvo");
		Thread.sleep(3000);
		
		sel.deselectByValue("saab");
		Thread.sleep(3000);
		
		sel.deselectByVisibleText("Mercedes");
		Thread.sleep(3000);
		sel.deselectByIndex(3);
		Thread.sleep(3000);
		
		sel.selectByIndex(3);
		Thread.sleep(3000);
		
		sel.selectByValue("saab");
		Thread.sleep(3000);
		
		sel.selectByVisibleText("Mercedes");
		Thread.sleep(3000);
		sel.selectByIndex(0);
		Thread.sleep(3000);
		
		
		sel.deselectAll();
		
		
	}
}
