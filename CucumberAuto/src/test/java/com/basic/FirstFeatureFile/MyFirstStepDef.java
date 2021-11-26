package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyFirstStepDef {

	WebDriver driver;
	
	@Given("^User needs to open a register page$")
	public void user_needs_to_open_a_facebook_page() {		
		System.setProperty("webdriver.chrome.driver", "/Users/skdb/Desktop/Cucumber/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.shridharmasthala.org/register-user/");
	}
	
	@When("^User needs enters user firstname$")
	public void user_needs_enters_user_firstname() {	
		driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[1]/div[2]/input")).sendKeys("Salin");
	}
	
	@Then("^User checks user firstname is present$")
	public void user_checks_user_firstname_is_present() {	
		String userActualName = driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[1]/div[2]/input")).getAttribute("value");
		Assert.assertEquals("Salin", userActualName);
	}
}

