package com.skillbay.testng.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	@FindBy(id = "username")
	WebElement usernameTextBox;
	
	//WebElement usernameTextBox = driver.findElemment(By.id("username"));
	
	@FindBy(name = "pwd")
	WebElement passwordTextBox;
	
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	public void enterUserName(String un)
	{
		usernameTextBox.sendKeys(un);
	}
	
	public void enterPassword(String pwd)
	{
		passwordTextBox.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
}
