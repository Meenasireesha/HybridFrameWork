package com.testscenarios;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class PHP_demo extends CommonFunctions{
	
  @Test
  public void f() throws Exception {		
	  chromeBrowser();
	  driver.get(readPropertyFileData("php_URL"));
	  driver.findElement(loc.phpLogin_fname_editbox).sendKeys(readPropertyFileData("php_fname"));
	  driver.findElement(loc.phpLogin_sumbit_button).click();
	  driver.switchTo().alert().accept();
	  takeScreenshotAndStroeItIntoFolder();
  }
}
