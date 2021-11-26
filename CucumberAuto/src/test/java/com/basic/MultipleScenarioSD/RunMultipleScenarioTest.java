package com.basic.MultipleScenarioSD;

import org.junit.runner.RunWith;

	@RunWith(io.cucumber.junit.Cucumber.class)
	
	@io.cucumber.junit.CucumberOptions(
			//publish=true,
			monochrome=true,
			//dryRun=true,
			
		    stepNotifications = true,
		    features= {"src/test/resources/com/basic/MultipleScenarioFF/"},
		    glue= {"com.basic.MultipleScenarioSD"},
		    plugin={
		    		"html:target/cucumber-htmlReport.html",
		    		"json:target/cucumber_testReport6.json",	
		    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		    }
     )	
	
	public class RunMultipleScenarioTest {
		
}

