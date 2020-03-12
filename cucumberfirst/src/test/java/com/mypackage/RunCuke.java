package com.mypackage;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\ADMIN\\eclipse-workspace2\\cucumberfirst\\src\\test\\resources\\features\\Login.feature"},glue= {"LoginStep"},monochrome=true,plugin = {"pretty","json:target/report.json","html:target/cucumber-html-report"})
public class RunCuke {
	 

}
