package com.basic.SharedSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SharedStepDef {

	WebDriver driver;
	
	public SharedStepDef(Shared share) { 
		this.driver = share.setup();
	}

	@Given("^User needs to open a register page$")
	public void user_needs_to_open_a_facebook_page() throws InterruptedException {		
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
	
}

