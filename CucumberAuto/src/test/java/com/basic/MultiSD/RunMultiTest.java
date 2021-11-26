package com.basic.MultiSD;

import org.junit.runner.RunWith;

	@RunWith(io.cucumber.junit.Cucumber.class)
	
	@io.cucumber.junit.CucumberOptions(
			//publish=true,
			monochrome=true,
			//dryRun=true,
			
		    stepNotifications = true,
		    features= {"src/test/resources/com/basic/MultiFF/"},
		    glue= {"com.basic.MultiSD"},
		    plugin={
		    		"html:target/cucumber-htmlReport.html",
		    		"json:target/cucumber_testReport7.json",		    		
		    }
     )	
	
	public class RunMultiTest {
		
}
