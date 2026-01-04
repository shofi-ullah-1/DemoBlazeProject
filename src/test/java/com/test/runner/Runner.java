package com.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = "src/test/resources",
    glue = {"steps"},  
    		plugin = {
    			    "pretty",
    			    "html:target/cucumber-report.html",
    			    "json:target/cucumber.json",
    			    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    			},

    monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
