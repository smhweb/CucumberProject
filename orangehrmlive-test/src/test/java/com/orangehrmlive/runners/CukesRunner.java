package com.orangehrmlive.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Login_datatable_withHeader", dryRun = false, plugin = "html:target/cucumber-reports", features = "src/test/resources/features", glue = "com/orangehrmlive/step_definitions")

public class CukesRunner {

}
