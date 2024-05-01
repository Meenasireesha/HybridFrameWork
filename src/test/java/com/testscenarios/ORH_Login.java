package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class ORH_Login extends CommonFunctions{
  @Test
  public void f() throws Exception {
	  chromeBrowser();
	  getURL("orh_URL");
	  sendKeysByAnyLocator(loc.orh_uname_editbox, "orh_Username");
	  sendKeysByAnyLocator(loc.orh_pswd_editbox, "orh_Password");
	  clickByAnyLocator(loc.orh_login_button);
  }
}
