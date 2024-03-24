package com.testscenarios;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		chromeBrowser();
		driver.get("https://www.facebook.com/");
		driver.findElement(loc.fblogin_email_editbox).sendKeys("meenasireesha@gmail.com");
		driver.findElement(loc.fblogin_password_editbox).sendKeys("aaaa");
		takeScreenshotAndStroeItIntoFolder();
		driver.findElement(loc.fblogin_login_button).click();
		Thread.sleep(3000);		
		takeScreenshotAndStroeItIntoFolder();

	}
}
