package com.basic.backgroundSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * Clase para probar el escenario
 * @author fran
 *
 */
public class BackgroundStepDef {
	
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fran\\Desktop\\curso-cucumber\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String username) throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(username);
		Thread.sleep(1000);
	}
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String userName) throws InterruptedException{
		String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
		Assert.assertEquals(userName, userNameActual);
		Thread.sleep(1000);
	}
	
	
	@And("^User enters user \"([^\"]*)\" username$")
	public void user_enters_user_username(String username) throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys(username);
		Thread.sleep(1000);
	}
	
	@But("^User mobile field should be blank")
	public void user_mobile_field_should_be_blank() throws InterruptedException{
		String mobileActual = driver.findElement(By.xpath("//input[@id='u_0_q']")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
	}
	
	@Then("^Close browser$")
	public void close_browser(){
		driver.quit();
		driver = null;
	}
}
