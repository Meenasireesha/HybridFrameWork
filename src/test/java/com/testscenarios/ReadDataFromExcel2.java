package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class ReadDataFromExcel2 extends CommonFunctions {
	@Test
	public void f() throws Exception {
		// read te excel file
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\td.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet("NOP");

		Row a = s.getRow(1);
		Cell gender = a.getCell(0);
		Cell fn = a.getCell(1);
		Cell ln = a.getCell(2);
		Cell date = a.getCell(3);
		Cell month = a.getCell(4);
		
		System.out.println(gender.getStringCellValue());

		chromeBrowser();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		Thread.sleep(3000);
		

		if ((gender.getStringCellValue()).equals("M")) {
			driver.findElement(By.id("gender-male")).click();
		} else {
			driver.findElement(By.id("gender-female")).click();
		}
		
		

	}

}
