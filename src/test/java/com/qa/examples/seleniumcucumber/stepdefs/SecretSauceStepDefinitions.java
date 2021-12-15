package com.qa.examples.seleniumcucumber.stepdefs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.examples.seleniumcucumber.pages.LoginPage;
import com.qa.examples.seleniumcucumber.pages.PageRepository;
import com.qa.examples.seleniumcucumber.utils.WebDriverHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecretSauceStepDefinitions {

	private WebDriver webDriver;

	private String username;
	private String password;
	private String forename;
	private String surname;
	private String postcode;

	private PageRepository pages;

	// constructor injection
	public SecretSauceStepDefinitions(WebDriverHooks hooks) {
		this.webDriver = hooks.getWebDriver();
		this.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		this.webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		this.pages = new PageRepository();
		this.pages.loginPage = PageFactory.initElements(this.webDriver, LoginPage.class);
	}

	@Given("the user is logged in")
	public void theUserIsLoggedIn() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user adds items to the cart")
	public void theUserAddsItemsToTheCart(List<String> items) {
		// iterate through items
		// add each to cart
		throw new io.cucumber.java.PendingException();
	}

	@When("the user navigates to the cart")
	public void theUserNavigatesToTheCart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user proceeds to checkout")
	public void theUserProceedsToCheckout() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user enters their details")
	public void theUserEntersTheirDetails() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user proceeds to checkout overview")
	public void theUserProceedsToCheckoutOverview() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user confirms the transaction")
	public void theUserConfirmsTheTransaction() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("a purchase verification should appear on the screen saying {string}")
	public void aPurchaseVerificationShouldAppearOnTheScreenSaying(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
