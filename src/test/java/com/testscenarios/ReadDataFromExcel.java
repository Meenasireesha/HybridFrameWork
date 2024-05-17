package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class ReadDataFromExcel extends CommonFunctions {
	@Test
	public void f() throws Exception {
		// read te excel file
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\td.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet("FbLogin");
		
		chromeBrowser();
		
		
		
	
		
		//i = row, j = coloum
		for (int i = 1; i <= 4; i++) {
			Row a = s.getRow(i);
			Cell un = a.getCell(0);
			Cell pwd = a.getCell(1);
			System.out.println("*****************************");
			System.out.println(un.getStringCellValue());
			System.out.println(pwd.getStringCellValue());
			System.out.println("*****************************");			
			
			driver.get("https://www.facebook.com/");
			Thread.sleep(1000);
			driver.findElement(loc.fblogin_email_editbox).sendKeys(un.getStringCellValue());
			driver.findElement(loc.fblogin_password_editbox).sendKeys(pwd.getStringCellValue());
			takeScreenshotAndStroeItIntoFolder();
			driver.findElement(loc.fblogin_login_button).click();
			Thread.sleep(3000);
			
			
		}
		takeScreenshotAndStroeItIntoFolder();
	}
}
