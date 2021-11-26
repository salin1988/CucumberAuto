package com.basic.BackgroundSD;

import org.junit.runner.RunWith;

	@RunWith(io.cucumber.junit.Cucumber.class)
	
	@io.cucumber.junit.CucumberOptions(
			//publish=true,
			monochrome=true,
			//dryRun=true,
			
		    stepNotifications = true,
		    features= {"src/test/resources/com/basic/BackgroundFF/"},
		    glue= {"com.basic.BackgroundSD"},
		    plugin={
		    		"html:target/cucumber-htmlReport.html",
		    		"json:target/cucumber_testReport1.json",		    		
		    }
     )	
	
	public class RunBackgroundTest {
		
}

