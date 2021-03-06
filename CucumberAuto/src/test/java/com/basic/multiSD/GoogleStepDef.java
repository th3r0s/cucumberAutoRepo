package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {

	WebDriver driver;
	
	@Given ("^User need to be on Google page$")
	public void user_need_to_be_on_google_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fran\\Desktop\\curso-cucumber\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.es/");
	}
	
	@When("^User enters search string$")
	public void user_enters_search_string(){
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
	}
}
