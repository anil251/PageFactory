package com.automation.keyworddriven.scropts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.BaseClass.Base;
import com.automation.Pagefactory.LoginPage;

public class ActionEngine extends Base {
	
	public static void enterurl(String url) {
		driver.get(url);
		
	}
	public static void login() {
		WebDriver driver=Base.openbrowser("chrome", "http://www.demo.guru99.com/V4/");
		LoginPage login =PageFactory.initElements(driver, LoginPage.class);
		login.guru_login("mngr288390", "betUvaz");
	}

}
