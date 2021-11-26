package com.basic.SharedSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Shared {
	
    WebDriver driver;
	
	@Before
	public WebDriver setup() {
		System.out.println("Before Setup");
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "/Users/skdb/Desktop/Cucumber/chromedriver");
			driver = new ChromeDriver();
		}
		
		return driver;
	}
	
	@After
	public void tearDown() {
		System.out.println("After tearDown");
		driver.quit();
		driver=null;
	}
}
