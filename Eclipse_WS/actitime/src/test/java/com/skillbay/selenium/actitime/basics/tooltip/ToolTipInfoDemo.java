package com.skillbay.selenium.actitime.basics.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class ToolTipInfoDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  ActitimeUtils.getDriver();
		
		ActitimeUtils.launch("https://www.redbus.in/");
		String strBusHireToolTip = driver.findElement(By.xpath("//a[text()='BUS HIRE ']")).getAttribute("title");
	
		String strRPool = driver.findElement(By.id("cars")).getAttribute("title");
		
		System.out.println("Bus Hire Tool tip --> " + strBusHireToolTip);
		System.out.println("rPool Tool tip -->" + strRPool);
		
		
		driver.close();
		
	}
	
}
