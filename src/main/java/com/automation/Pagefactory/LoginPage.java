package com.automation.Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	  
	  WebDriver driver;
	  public LoginPage(WebDriver driver) { 
		  this.driver = driver;
	  
	  }
	 

	@FindBy(how = How.XPATH, using = "//input[@name='uid']")
	@CacheLookup
	WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@value='LOGIN']")
	@CacheLookup
	WebElement btn;

	public void guru_login(String uid, String pass) {
		username.sendKeys(uid);
		password.sendKeys(pass);		
		btn.click();
		if (password.equals(pass)) {
			System.out.println("The Password Is Correct");			

		} else {
			System.out.println("The Password Is Not Correct");
			
		}
		driver.switchTo().alert().dismiss();
		driver.quit();
	}

}
