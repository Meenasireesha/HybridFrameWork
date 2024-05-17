package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class Clg_rig extends CommonFunctions {
	@Test
	public void f() throws Exception {
		chromeBrowser();
		getURL("clg_URL");
		sendKeysByAnyLocator(loc.clg_fname_editbox, "clg_Fname");
		sendKeysByAnyLocator(loc.clg_lname_editbox, "clg_Lname");
		sendKeysByAnyLocator(loc.clg_email_editbox, "clg_email");
		sendKeysByAnyLocator(loc.clg_mobile_editbox, "clg_Mobile");
		sendKeysByAnyLocator(loc.clg_pwd_editbox, "clg_password");
		sendKeysByAnyLocator(loc.clg_cnfpwd_editbox, "clg_CnfPassword");
		clickByAnyLocator(loc.clg_submit_Button);
		
		
	

	}
}
