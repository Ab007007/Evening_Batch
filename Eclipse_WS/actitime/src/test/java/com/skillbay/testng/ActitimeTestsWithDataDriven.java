package com.skillbay.testng;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeTestsWithDataDriven {
	WebDriver driver = null;
	ExtentReports reports = null;
	ExtentTest test = null;

	@BeforeSuite
	public void createReports() {
		reports = new ExtentReports("reports/Automation_TestExecution_report"
				+ new Date().toString().replace(" ", "_").replace(":", "_") + ".html");

	}

	@AfterSuite
	public void saveReports() {
		reports.flush();
	}

	@BeforeClass
	public void createDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void closeDriver() {
		driver.close();
	}

	@Parameters({"url", "username" , "password"})
	@BeforeMethod
	public void launchAndLogin(String url, String un, String pwd) throws InterruptedException {
		driver.get(url);

		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
	}

	@Test(dataProviderClass = TestData.class , dataProvider = "createProjectdata", priority = 2)
	public void createProject(String cn, String pn, String pd) throws InterruptedException {
		test = reports.startTest("--create project test is started ---");
		Reporter.log("--- Creating a Customer ---");

		test.log(LogStatus.INFO, "clicking on tasks module");
		driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();

		test.log(LogStatus.INFO, "clicking on add new button");
		driver.findElement(By.xpath("//div[@class='addNewContainer']")).click();

		test.log(LogStatus.INFO, "clicking on New Project");
		driver.findElement(By.xpath("//div[contains(text(),'New Project')]")).click();
		test.log(LogStatus.PASS, "New project window is dispalyed ");

		test.log(LogStatus.INFO, "Entering project name");
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys(pn);

		test.log(LogStatus.INFO, "Clicking on dropdown to select the customer");
		driver.findElement(By.id("projectPopup_customerSelectorPlaceholder")).click();

		test.log(LogStatus.INFO, "Selecting the customer");
		driver.findElement(By.xpath("//ul//a[text()='" + cn + "']")).click();

		test.log(LogStatus.INFO, "Entering Project description");
		driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys(pd);

		test.log(LogStatus.INFO, "clicking on New Project Button");
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("projectPopup_commitBtn")));
		driver.findElement(By.id("projectPopup_commitBtn")).click();

		test.log(LogStatus.INFO, "Waiting for the successs message to appear");

		Reporter.log("-- Validating success message---<br>");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement toastEle = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toasts']"))));

		Reporter.log("Toast message is : " + toastEle.getText());

		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toasts']"))));
		Reporter.log("Toast message is disappeared!");
		Reporter.log("--- Creating a Project is successfull---");
		test.log(LogStatus.PASS, "Project created successfully");
		reports.endTest(test);
	}

	@Test(dataProviderClass = TestData.class , dataProvider = "createcustomerdata", priority = 1)
	public void createCustomer(String cn, String cd) throws InterruptedException {
		test = reports.startTest("--create Customer test is started ---");

		Reporter.log("--- Creating a Customer ---");

		driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
		driver.findElement(By.xpath("//div[@class='addNewContainer']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();

		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cn);
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cd);
		driver.findElement(By.id("customerLightBox_commitBtn")).click();

		Reporter.log("-- Validating success message---");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement toastEle = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toasts']"))));

		Reporter.log("Toast message is : " + toastEle.getText());

		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toasts']"))));
		Reporter.log("Toast message is disappeared!");
		Reporter.log("--- Creating a Customer is successfull ---");
		test.log(LogStatus.PASS, "Customer created successfully");
		reports.endTest(test);

	}
}