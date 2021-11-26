package com.basic.MultiSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDef {
	
	WebDriver driver;
	
	@Given("^User needs to open a register1 page$")
	public void user_needs_to_open_a_facebook1_page() throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "/Users/skdb/Desktop/Cucumber/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@When("^User needs enters user1 \"([^\"]*)\" firstname$")
	public void user_needs_enters_user_firstname1(String userName) throws InterruptedException {	
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(userName);
	}
	
	@And("^User needs enters user1 \"([^\"]*)\" surname$")
	public void user_needs_enters_user_surname1(String surName)  throws InterruptedException {	
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(surName);
	}
	
	
	@Then("^User checks user1 \"([^\"]*)\" firstname is present$")
	public void user_checks_user_firstname_is_present1(String userName) throws InterruptedException {	
		String userActualName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).getAttribute("value");
		Assert.assertEquals(userName, userActualName);
	}
	
	@And("^User checks user1 \"([^\"]*)\" surname is present$")
	public void user_checks_user_surname_is_present1(String surName) throws InterruptedException {
		String surname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).getAttribute("value");
		Assert.assertEquals(surName, surname);
	}
	
	@Then("^close browser1$")
	public void close_browser1() {
		driver.close();
		driver=null;
	}

}
