package com.skillbay.selenium.actitime.utils;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends WebDriverUtils {

	public static void launch(String url) {
		System.out.println("--- Launching Application --- " + url);
		driver.get(url);
	}

	public static void login(String un, String pwd) {
		System.out.println("--- Loging to the application " + un + " : " + pwd);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void validateAutoSuggestion(String pattern) {
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(pattern);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath("//table[@id='taskSearchControl']//div[@class='taskList']"))));

		List<WebElement> suggestions = driver.findElements(
				By.xpath("//table[@id='taskSearchControl']//div[@class='templates']/following-sibling::div"));

		Iterator<WebElement> it = suggestions.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getText());
		}

	}

	public static void selectModule(String type) {
		System.out.println("--- Selecting module " + type);
		click("xpath", "//div[text()='" + type.toUpperCase() + "']/parent::a");
	}

	public static void validateTitle(String expectedTitle) {
		System.out.println("--- Validating Title " + expectedTitle);
		String actualTitle = driver.getTitle();
		
		System.out.println("--- Validating Title Actual title" + actualTitle);
		
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched - PASS");
		} else {
			System.out.println("Title NOT matched - FAIL");
		}
	}

	public static void clickOnCreateCustomerButton() {
		System.out.println("--- clicking on create customer button ---");
		click("xpath", "//div[@class='addNewContainer']");
		click("xpath", "//div[contains(text(),'New Customer')]");
	}



	public static void createCustomer(String  cn, String cd)
	{
		System.out.println("--- Creating customer with " + cn + " and " + cd);
		type("id", "customerLightBox_nameField", cn);
		type("id","customerLightBox_descriptionField", cd);
		click("id", "customerLightBox_commitBtn");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement toastEle = wait.until(ExpectedConditions.visibilityOf(getElement("xpath", "//div[@class='toasts']")));
		
		System.out.println("Toast message is : " + toastEle.getText());
		
		wait.until(ExpectedConditions.invisibilityOf(getElement("xpath", "//div[@class='toasts']")));
		System.out.println("Toast message is disappeared!");
	}

	
	
	public static void logout()
	{
		System.out.println("--- logout of the application ---");
		click("id", "logoutLink");
		driver.close();
	}
	
	
	
	
	
	
}
