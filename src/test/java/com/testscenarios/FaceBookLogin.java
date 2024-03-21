package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class FaceBookLogin {
  @Test
  public void login() {
//	  create an object for locators  class
//	  classname objectname = new classname();
	  Locators loc=new Locators();
	  WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(loc.fblogin_email_editbox).sendKeys("meenasireesha@gmail.com");
		driver.findElement(loc.fblogin_password_editbox).sendKeys("aaaa");

		driver.findElement(loc.fblogin_login_button).click();
  }
}
