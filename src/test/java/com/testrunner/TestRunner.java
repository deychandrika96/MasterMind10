package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="CcucumberFeature";
		glue="com.stepdefinition"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
