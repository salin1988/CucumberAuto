package com.basic.SharedSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;

public class SharedStepDef2 {

	WebDriver driver;
	
	public SharedStepDef2(Shared share) { 
		this.driver = share.setup();
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
}

