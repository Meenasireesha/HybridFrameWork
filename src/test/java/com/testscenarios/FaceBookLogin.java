package com.testscenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

public class FaceBookLogin extends CommonFunctions {

	@Test
	public void login() throws Exception {
		// read the property file data
		Properties p = new Properties();
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\QA_Envi.properties");
		p.load(fi);

		chromeBrowser();
		driver.get(p.getProperty("fb_URL"));
		driver.findElement(loc.fblogin_email_editbox).sendKeys(p.getProperty("fb_username"));
		driver.findElement(loc.fblogin_password_editbox).sendKeys(p.getProperty("fb_password"));
		takeScreenshotAndStroeItIntoFolder();
		driver.findElement(loc.fblogin_login_button).click();
		Thread.sleep(3000);
		takeScreenshotAndStroeItIntoFolder();

	}
}
