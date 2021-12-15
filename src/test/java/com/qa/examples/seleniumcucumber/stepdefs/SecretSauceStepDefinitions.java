package com.qa.examples.seleniumcucumber.stepdefs;

import static org.junit.Assert.assertTrue;

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

	private String username = "standard_user";
	private String password = "secret_sauce";
	private String forename = "fred";
	private String surname = "red";
	private String postcode = "SO15 23R";

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
		this.pages.storePage = pages.loginPage
									.login(username, password);
	}

	@When("the user adds items to the cart")
	public void theUserAddsItemsToTheCart(List<String> items) {
		for (String item : items) {
			pages.storePage
			     .addItemToCart(item);
		}
	}

	@When("the user navigates to the cart")
	public void theUserNavigatesToTheCart() {
		pages.cartPage = pages.storePage
				              .navigateToCart();
	}

	@When("the user proceeds to checkout")
	public void theUserProceedsToCheckout() {
		pages.checkoutPage = pages.cartPage
				                  .navigateToCheckout();
	}

	@When("the user enters their details")
	public void theUserEntersTheirDetails() {
		pages.checkoutPage
		     .fillForm(forename, surname, postcode);
	}

	@When("the user proceeds to checkout overview")
	public void theUserProceedsToCheckoutOverview() {
		pages.checkoutOverviewPage = pages.checkoutPage
				                          .navigateToCheckoutOverview();
	}

	@When("the user confirms the transaction")
	public void theUserConfirmsTheTransaction() {
		pages.checkoutCompletePage = pages.checkoutOverviewPage
				                          .completeTransaction();
	}

	@Then("a purchase verification should appear on the screen saying {string}")
	public void aPurchaseVerificationShouldAppearOnTheScreenSaying(String expected) {
		boolean orderSuccess = pages.checkoutCompletePage
									.didOrderComplete(expected);
		assertTrue(orderSuccess);
	}

}
