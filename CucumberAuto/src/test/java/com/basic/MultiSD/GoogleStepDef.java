package com.basic.MultiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDef {
	
	WebDriver driver;
	
	@Given("^User needs to open the google page$")
	public void user_needs_to_open_the_google_page() {
		System.setProperty("webdriver.chrome.driver","/Users/skdb/Desktop/Cucumber/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
	}
	
	@When("^User search keyword in search$")
	public void user_search_keyword_in_search() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
		Thread.sleep(2000);
	}
	
	@Then("^close google browser$")
	public void close_browser() {
		driver.close();
		driver=null;
	}


}
