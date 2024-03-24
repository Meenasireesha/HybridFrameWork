package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.objectrepository.Locators;

public class CommonFunctions {
	public static WebDriver driver;

	public Locators loc = new Locators();

	public void chromeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome browser is launched successfully**********");
	}

	// Get the time stamp
	public String timeStamp() {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("MMMddyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println("timeStamp method is executed successfully**********");
		return timeStamp;
	}

	// Take screenshot
	public void takeScreenshotAndStroeItIntoFolder() throws Exception {
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File(".\\screenshots\\Testabc_" + timeStamp() + ".png"));
		System.out.println("takeScreenshotAndStroeItIntoFolder method is executed successfully**********");
	}

	// refresh
	public void refreshThePage() {
		driver.navigate().refresh();
		System.out.println("refreshThePage method is executed successfully**********");
	}

}// class close
