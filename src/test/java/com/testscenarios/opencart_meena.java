package com.testscenarios;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

public class opencart_meena extends CommonFunctions {
	@Test
	public void opencart_register() throws Exception {
		chromeBrowser();

		driver.get("https://opencart-prf.exense.ch/index.php?route=account/register");
		driver.manage().window().maximize();
//		Thread.sleep(3000);
		driver.findElement(loc.register_continue_button).click();

		// get the validation messages
		List<WebElement> errorMsg = driver.findElements(loc.register_errorMsgs);
		for (WebElement webElement : errorMsg) {
			System.out.println(webElement.getText());
		}

		// page refresh
		refreshThePage();
		takeScreenshotAndStroeItIntoFolder();
	}

}
