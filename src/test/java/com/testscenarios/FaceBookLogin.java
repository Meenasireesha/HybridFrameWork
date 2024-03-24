package com.testscenarios;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class FaceBookLogin {
  @Test
  public void login() throws Exception {
//	  create an object for locators  class
//	  classname objectname = new classname();
	  Locators loc=new Locators();
	  WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(loc.fblogin_email_editbox).sendKeys("meenasireesha@gmail.com");
		driver.findElement(loc.fblogin_password_editbox).sendKeys("aaaa");

		driver.findElement(loc.fblogin_login_button).click();
		Thread.sleep(3000);
		File abc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File("C:\\Users\\PawanKS\\eclipse-workspace\\HybridFrameWork_Meena\\screenshots\\Testabc.png"));

  }
}
