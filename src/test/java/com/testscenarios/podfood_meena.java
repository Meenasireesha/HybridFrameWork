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
//		refresh the data and click on login button without the data and refresh.
//		give invalid data and click on login button and error messages sould display in console. 
		driver.navigate().refresh();
		driver.findElement(loc.podlogin_login_click1).click();
//		driver.findElement(loc.fblogin_email_editbox).sendKeys(")
		driver.findElement(loc.podlogin_login_click).click();
		String a = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/form/div[2]/div/div[2]")).getText();
		System.out.println(a);
		String b= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/form/div[3]/div/div[2]")).getText();
		System.out.println(b);
		String c= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/form/div[4]/div/div[2]")).getTagName();
		System.out.println(c);
		driver.navigate().refresh();
//		Thread.sleep(2000);
		driver.findElement(loc.podlogin_email_editbox).sendKeys("gdshjedh");
		driver.findElement(loc.podlogin_password_editbox).sendKeys("7362879");
		driver.findElement(loc.podlogin_contact_click).click();
		driver.findElement(loc.podlogin_login_click).click();
		
		
	}

}
