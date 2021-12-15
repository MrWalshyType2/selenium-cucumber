package com.qa.examples.seleniumcucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/"},
				 tags = "@selenium",
				 snippets = SnippetType.CAMELCASE,
				 plugin = { "html:target/cucumber-reports/cucumber-selenium-report.html" },
				 monochrome = true
)				
public class CucumberSeleniumTestRunner {

}
