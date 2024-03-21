package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class podfood_meena {
	@Test
	public void login() throws Exception {
		Locators loc = new Locators();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://podfoods.co/register");
		driver.manage().window().maximize();
		driver.findElement(loc.podlogin_companyname_editbox).sendKeys("ksjdkdj");
		driver.findElement(loc.podlogin_businesssemail_editbox).sendKeys("jsadhjk@gmail.com");
		driver.findElement(loc.podlogin_website_editbox).sendKeys("ghgj");
		driver.findElement(loc.podlogin_contacttype_dropdown1).click();
		Thread.sleep(2000);
		driver.findElement(loc.podlogin_contacttype_dropdown).click();
		driver.findElement(loc.podlogin_submit_button).click();
	}

}
