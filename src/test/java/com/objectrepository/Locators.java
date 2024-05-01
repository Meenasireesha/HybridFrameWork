package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {
	public final By fblogin_email_editbox = By.id("email");
	public final By fblogin_password_editbox = By.id("pass");
	public final By fblogin_login_button = By
			.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button");

	public final By podlogin_companyname_editbox = By
			.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/form/div[1]/div/div[1]/input");
	public final By podlogin_businesssemail_editbox = By
			.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/form/div[2]/div/div[1]/input");
	public final By podlogin_website_editbox = By
			.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/form/div[3]/div/div[1]/input");
	public final By podlogin_contacttype_dropdown1 = By
			.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/form/div[4]/div/div/div/input");
	public final By podlogin_contacttype_dropdown = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[1]");
	public final By podlogin_submit_button = By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/form/button");
	public final By podlogin_login_click1 = By.xpath("//*[@id=\"app\"]/div[1]/div/div[4]/div/div[1]/a[1]");
	public final By podlogin_email_editbox = By.name("email");
	public final By podlogin_password_editbox = By.name("password");
	public final By podlogin_contact_click = By
			.xpath("//*[@id=\"content\"]/div/div[2]/form/div[4]/div/div/label[1]/span");
	public final By podlogin_login_click = By.xpath("//*[@id=\"content\"]/div/div[2]/form/div[5]/div/button");

	public final By register_continue_button = By.xpath("//input[@value='Continue']");
	public final By opencart_username_editbox = By.id("input-username");
	public final By opencart_firstname_editbox = By.id("input-firstname");
	public final By opencart_last_editbox = By.id("input-lastname");
	public final By opencart_email_editbox = By.id("input-email");
	public final By opencart_country_dropdown = By.id("input-country");
	public final By opencart_password_editbox = By.id("input-password");
	public final By register_errorMsgs = By.xpath("//*[@class='text-danger']");

	// php locators
	public final By phpLogin_fname_editbox = By.name("first_name");
	public final By phpLogin_sumbit_button = By.id("demo");

	// College week live locators
	public final By clg_fname_editbox = By.name("firstName");
	public final By clg_lname_editbox = By.name("lastName");
	public final By clg_email_editbox = By.name("emailAddress");
	public final By clg_mobile_editbox = By.name("phoneNumber");
	public final By clg_pwd_editbox = By.name("password");
	public final By clg_cnfpwd_editbox = By.name("ConfirmPassword");
	public final By clg_submit_Button = By.id("submit");

	// ORH locators
	public final By orh_uname_editbox = By.name("username");
	public final By orh_pswd_editbox = By.name("password");
	public final By orh_login_button = By.xpath("//button[@type='submit']");

}
