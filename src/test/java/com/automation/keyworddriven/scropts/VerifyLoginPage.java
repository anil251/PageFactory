package com.automation.keyworddriven.scropts;

import org.testng.annotations.Test;

import com.automation.BaseClass.Base;

public class VerifyLoginPage extends Base {
	
	@Test
	public void checkvalidateuser() {
		/*
		 * WebDriver driver=Base.openbrowser("chrome",
		 * "http://www.demo.guru99.com/V4/"); LoginPage login
		 * =PageFactory.initElements(driver, LoginPage.class);
		 * login.guru_login("mngr288390", "betUvaz");
		 */
		
		//ActionEngine.enterurl(url);
		ActionEngine.login();
	}

}
