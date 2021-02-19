package com.skillbay.selenium.actitime.popup;

import org.openqa.selenium.WebDriver;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;
import com.skillbay.selenium.actitime.utils.FileUtils;

public class HiddenDivisionPopUp {

	public static void main(String[] args) {
		WebDriver driver  = ActitimeUtils.getDriver(FileUtils.getGlobalData("browser"));
		ActitimeUtils.launch(FileUtils.getGlobalData("url"));
		ActitimeUtils.login(FileUtils.getGlobalData("username"),FileUtils.getGlobalData("password"));
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.validateTitle("actiTIME - Task List");
		
		ActitimeUtils.click("xpath", "//table[@class='taskRowsTable']//tr[1]//div[@class='img']");
		ActitimeUtils.click("xpath", "//div[@class='groupOperationMenu']//div[@class='deleteButton']");
		ActitimeUtils.click("id", "deleteTaskPopup_deleteConfirm_submitBtn");
		ActitimeUtils.validateSussessMessage();
		ActitimeUtils.logout();
		
	}
}
