package com.basic.dataDrivenSD;

import org.junit.runner.RunWith;

	@RunWith(io.cucumber.junit.Cucumber.class)
	
	@io.cucumber.junit.CucumberOptions(
			//publish=true,
			monochrome=true,
			//dryRun=true,
			
		    stepNotifications = true,
		    features= {"src/test/resources/com/basic/dataDrivenFF/"},
		    glue= {"com.basic.dataDrivenSD"},
		    plugin={
		    		"html:target/cucumber-htmlReport.html",
		    		"json:target/cucumber_testReport3.json",		    		
		    }
     )	
	
	public class RunPdataDrivenTest {
		
}

