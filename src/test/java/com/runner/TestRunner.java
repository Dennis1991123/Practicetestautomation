package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",
				 glue={"com.stepdefinitions","com.hooks"},
				 publish=true,dryRun = false,
				 plugin={"pretty","html:target/CucumberReports/CucumberReport.html"})
public class TestRunner  extends AbstractTestNGCucumberTests{

}
