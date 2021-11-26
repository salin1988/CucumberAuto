package com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;

	@RunWith(io.cucumber.junit.Cucumber.class)
	
	@io.cucumber.junit.CucumberOptions(
			//publish=true,
			monochrome=true,
			//dryRun=true,
			
		    stepNotifications = true,
		    features= {"src/test/resources/com/basic/FirstFeatureFileFF/"},
		    glue= {"com.basic.FirstFeatureFile"},
		    plugin={
		    		"html:target/cucumber-htmlReport.html",
		    		"json:target/cucumber_testReport5.json",		    		
		    }
     )	
	
	public class RunMyFirstFeatureTest {
		
}

