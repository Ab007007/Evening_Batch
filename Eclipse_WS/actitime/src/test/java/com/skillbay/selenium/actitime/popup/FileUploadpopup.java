package com.skillbay.selenium.actitime.popup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.skillbay.selenium.actitime.utils.ActitimeUtils;

public class FileUploadpopup {

	static
	{
		try {
			Runtime.getRuntime().exec("D:\\aimorc_training\\autoit\\chrome_popup_handler.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/fileupload");
		ActitimeUtils.click("xpath", "//button[text()='Choose']");
				
	}
}
