package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {
	public final By fblogin_email_editbox = By.id("email");
	public final By fblogin_password_editbox = By.id("pass");
	public final By fblogin_login_button = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button");

	public final By podlogin_companyname_editbox=By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/form/div[1]/div/div[1]/input");
	public final By podlogin_businesssemail_editbox= By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/form/div[2]/div/div[1]/input");
	public final By podlogin_website_editbox=By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/form/div[3]/div/div[1]/input");
	public final By podlogin_contacttype_dropdown1=By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/form/div[4]/div/div/div/input");
	public final By podlogin_contacttype_dropdown=By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[1]");
	public final By podlogin_submit_button=By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/form/button");
	
}
