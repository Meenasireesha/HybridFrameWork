package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.objectrepository.Locators;

public class CommonFunctions {
	public static WebDriver driver;

	public Locators loc = new Locators();

	public String readPropertyFileData(String input) throws Exception {
		Properties p = new Properties();
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\QA_Envi.properties");
		p.load(fi);
		return p.getProperty(input);
	}

	public void chromeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome browser is launched successfully**********");
	}

	public void getURL(String url) throws Exception {
		driver.get(readPropertyFileData(url));
		Thread.sleep(6000);
	}

	public void sendKeysByAnyLocator(By locator, String inputdata) throws Exception {
		WebElement element = driver.findElement(locator);

		// Check your locator is displayed?
		if (driver.findElements(locator).size() > 0) {
			// Check your element is in enable state?
			if (element.isEnabled()) {
				System.out.println("Given locator is enable state ***");
				// Clear any existing data
				highlightElement(element);
				Thread.sleep(300);
				element.clear();
				// Send the test data to Edit box
				highlightElement(element);
				Thread.sleep(300);
				element.sendKeys(readPropertyFileData(inputdata));
			} else {
				System.out.println("Given locator is not enable state on DOM(Current page***");
			}
		} else {
			System.out.println("Given locator is not displayed on DOM(Current page***");
		}
	}

	public void clickByAnyLocator(By locator) throws Exception {
		Thread.sleep(300);
		WebElement element = driver.findElement(locator);
		// Check your locator is displayed?
		if (driver.findElements(locator).size() > 0) {
			// Check your element is in enable state?
			if (element.isEnabled()) {
				// Click on Button/radiobutton/checkbox/Link...
				highlightElement(element);
				element.click();
			} else {
				System.out.println("Given locator is not enable state on DOM(Current page***");
			}
		} else {
			System.out.println("Given locator is not displayed on DOM(Current page***");
		}
	}

	public void highlightElement(WebElement element) throws InterruptedException {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			for (int i = 0; i < 1; i++) {
				executor.executeScript("arguments[0].style.border='7px solid red'", element);
				Thread.sleep(200);
				executor.executeScript("arguments[0].style.border='7px groove green'", element);
			}
		} catch (Exception e) {
			System.out.println("Exception - " + e.getMessage());
		}
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
