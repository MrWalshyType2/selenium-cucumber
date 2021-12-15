package com.qa.examples.seleniumcucumber.stepdefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.qa.examples.seleniumcucumber.utils.WebDriverHooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BingStepDefinitions {

	private WebDriver webDriver;
	
	// constructor injection
	public BingStepDefinitions(WebDriverHooks hooks) {
		this.webDriver = hooks.getWebDriver();
	}

	@When("the user requests {word}")
	public void theUserRequests(String site) {
		webDriver.get(site);
	}

	@Then("the user should be on the Bing home page")
	public void theUserShouldBeOnTheBingHomePage() {
		assertEquals("Bing", webDriver.getTitle());
	}
}
