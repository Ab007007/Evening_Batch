package com.skillbay.selenium.actitime.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;
import com.skillbay.selenium.actitime.utils.FileUtils;

public class MultiBrowsersDemo {
	
	public static void main(String[] args) {
		WebDriver driver  = ActitimeUtils.getDriver(FileUtils.getGlobalData("browser"));
		ActitimeUtils.launch(FileUtils.getGlobalData("url"));
		
		ActitimeUtils.click("linktext", "actiTIME Inc.");
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		System.out.println("-- Parent WindowID --" + parentWindowID) ;
		System.out.println("-- Child WindowID --" + childWindowID) ;
		
		driver.switchTo().window(childWindowID);
		List<WebElement> hyperLinks = driver.findElements(By.tagName("a"));
	
		for (WebElement hyperlink : hyperLinks) {
			System.out.println(hyperlink.getText());
		}
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.logout();
		
		
	}

}
