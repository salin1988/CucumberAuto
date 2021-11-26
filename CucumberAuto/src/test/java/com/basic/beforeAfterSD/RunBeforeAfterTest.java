package com.basic.beforeAfterSD;

import org.junit.runner.RunWith;

	@RunWith(io.cucumber.junit.Cucumber.class)
	
	@io.cucumber.junit.CucumberOptions(
			//publish=true,
			monochrome=true,
			//dryRun=true,
			
		    stepNotifications = true,
		    features= {"src/test/resources/com/basic/beforeAfterFF/"},
		    glue= {"com.basic.beforeAfterSD"},
		    plugin={
		    		"html:target/cucumber-htmlReport.html",
		    		"json:target/cucumber_testReport2.json",		    		
		    }
     )	
	
	public class RunBeforeAfterTest {
		
}

