package com.basic.shareDataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {

WebDriver driver;
	
	@Before
	public WebDriver setup(){
		if(driver == null){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\fran\\Desktop\\curso-cucumber\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	@After
	public void tearDown(){
		driver.quit();
		driver = null;
	}
}
