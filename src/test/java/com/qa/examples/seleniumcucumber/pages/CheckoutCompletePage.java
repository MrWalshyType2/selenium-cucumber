package com.qa.examples.seleniumcucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage {

	private WebDriver driver;

	@FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
	private WebElement checkoutCompleteHeader;

	public CheckoutCompletePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean didOrderComplete(String expectedText) {
		return checkoutCompleteHeader.getText().equals("THANK YOU FOR YOUR ORDER");
	}

}
