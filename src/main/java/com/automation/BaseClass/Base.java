package com.automation.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static String currentdir;
	
	public static WebDriver openbrowser(String browsertype,String url) {
		
		currentdir = System.getProperty("user.dir");
		WebDriverManager.chromedriver().setup();
		if (browsertype.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();			
		}
		else if (browsertype.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			
		}
		else if (browsertype.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		return driver;

	}
	
	
	

}
