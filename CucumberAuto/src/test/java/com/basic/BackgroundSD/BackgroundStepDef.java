package com.basic.BackgroundSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundStepDef {

	WebDriver driver;
	
	@Given("^User needs to open a register page$")
	public void user_needs_to_open_a_facebook_page() throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "/Users/skdb/Desktop/Cucumber/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.shridharmasthala.org/register-user/");
	}
	
	@When("^User needs enters user \"([^\"]*)\" firstname$")
	public void user_needs_enters_user_firstname(String userName) throws InterruptedException {	
		driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[1]/div[2]/input")).sendKeys(userName);
	}
	
	@And("^User needs enters user \"([^\"]*)\" surname$")
	public void user_needs_enters_user_surname(String surName)  throws InterruptedException {	
		driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[1]/div[3]/input")).sendKeys(surName);
	}
	
	
	@Then("^User checks user \"([^\"]*)\" firstname is present$")
	public void user_checks_user_firstname_is_present(String userName) throws InterruptedException {	
		String userActualName = driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[1]/div[2]/input")).getAttribute("value");
		Assert.assertEquals(userName, userActualName);
	}
	
	@And("^User checks user \"([^\"]*)\" surname is present$")
	public void user_checks_user_surname_is_present(String surName) throws InterruptedException {
		String surname = driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[1]/div[3]/input")).getAttribute("value");
		Assert.assertEquals(surName, surname);
	}
	
	@But("^User mobile field should be blank$")
	public void but_User_mobile_field_should_be_blank() throws InterruptedException {
		String mobileNo = driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[2]/div[1]/input")).getAttribute("value");
		Assert.assertEquals("", mobileNo);		
	}
	
	@Then("^close browser$")
	public void close_browser() {
		driver.close();
		driver=null;
	}
}

