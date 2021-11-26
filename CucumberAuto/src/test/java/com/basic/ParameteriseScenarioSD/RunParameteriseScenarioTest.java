package com.basic.ParameteriseScenarioSD;

import org.junit.runner.RunWith;

	@RunWith(io.cucumber.junit.Cucumber.class)
	
	@io.cucumber.junit.CucumberOptions(
			//publish=true,
			monochrome=true,
			//dryRun=true,
			
		    stepNotifications = true,
		    features= {"src/test/resources/com/basic/ParameteriseScenarioFF/"},
		    glue= {"com.basic.ParameteriseScenarioSD"},
		    plugin={
		    		"html:target/cucumber-htmlReport.html",
		    		"json:target/cucumber_testReport8.json",		    		
		    }
     )	
	
	public class RunParameteriseScenarioTest {
		
}

