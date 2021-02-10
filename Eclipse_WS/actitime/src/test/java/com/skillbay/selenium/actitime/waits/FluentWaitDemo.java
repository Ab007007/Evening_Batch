package com.skillbay.selenium.actitime.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class FluentWaitDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("file:///D:/aimorc_training/html/tiimeout.html");
		driver.findElement(By.tagName("button")).click();

		//STEP1
		FluentWait<WebElement> wait = new FluentWait<WebElement>(
				driver.findElement(By.id("demo")))
				.pollingEvery(Duration.ofMillis(1000))
				.withTimeout(Duration.ofSeconds(30))
				.ignoring(NoSuchElementException.class);
		
		//STEP2
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {

			@Override
			public Boolean apply(WebElement ele) {
				
				boolean flag = false;
				if(ele.getText().equals("Hello"))
				{
					System.out.println("Element Found!!!!");
					flag = true;
				}
				else
				{
					System.out.println("Waiting for the element!!!!");
					flag = false;
				}
				
				return flag;
				
			}
		};
		
		//STEP3
		wait.until(fun);
		
		System.out.println("Demo " + driver.findElement(By.id("demo")).getText());
		System.out.println("Demo2 " + driver.findElement(By.id("demo2")).getText());
	}
}
