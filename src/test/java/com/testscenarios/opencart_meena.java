package com.testscenarios;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class opencart_meena {
	@Test
	public void opencart_register() throws Exception {
		Locators loc=new Locators();
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://opencart-prf.exense.ch/index.php?route=account/register");
		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.findElement(loc.opencart_register_click).click();
		driver.findElement(loc.opencart_username_editbox).sendKeys("");
		driver.findElement(loc.opencart_firstname_editbox).sendKeys("");
		driver.findElement(loc.opencart_last_editbox).sendKeys("");
		driver.findElement(loc.opencart_email_editbox).sendKeys("");
		driver.findElement(loc.opencart_country_dropdown).click();
		driver.findElement(loc.opencart_password_editbox).sendKeys("");
		driver.findElement(loc.opencart_register_click).click();
//		String a = driver.findElement(By.id("))
		File abc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File("C:\\Users\\PawanKS\\eclipse-workspace\\HybridFrameWork_Meena\\screenshots\\Testabc.png"));
	}

}
