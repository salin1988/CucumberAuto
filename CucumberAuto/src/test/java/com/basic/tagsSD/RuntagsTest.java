package com.basic.tagsSD;

import org.junit.runner.RunWith;

	@RunWith(io.cucumber.junit.Cucumber.class)
	
	@io.cucumber.junit.CucumberOptions(
			//publish=true,
			monochrome=true,
			//dryRun=true,
			
			tags= "@Smoke and @Regression",
			
		    stepNotifications = true,
		    features= {"src/test/resources/com/basic/tagsFF/"},
		    glue= {"com.basic.tagsSD"},
		    plugin={
		    		"html:target/cucumber-htmlReport.html",
		    		"json:target/cucumber_testReport10.json",		    		
		    }
     )	
	
	public class RuntagsTest {
		
}

