package com.basic.SharedSD;

import org.junit.runner.RunWith;

	@RunWith(io.cucumber.junit.Cucumber.class)
	
	@io.cucumber.junit.CucumberOptions(
			//publish=true,
			monochrome=true,
			//dryRun=true,
			
		    stepNotifications = true,
		    features= {"src/test/resources/com/basic/SharedFF/"},
		    glue= {"com.basic.SharedSD"},
		    plugin={
		    		"html:target/cucumber-htmlReport.html",
		    		"json:target/cucumber_testReport9.json",		    		
		    }
     )	
	
	public class RunBSharedTest {
		
}

