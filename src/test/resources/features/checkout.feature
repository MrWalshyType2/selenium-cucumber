@selenium
Feature: Checkout items on secret sauce

	As a user, I want to add items to my basket so that I can purchase them.
	
	Background:
		Given the user is logged in
		
	Scenario: Should succesfully purchase items
	  When the user adds items to the cart
								  		| Sauce Labs Backpack 	|
											| Sauce Labs Bike Light |
		And the user navigates to the cart
		And the user proceeds to checkout
		And the user enters their details
		And the user proceeds to checkout overview
		And the user confirms the transaction
		Then a purchase verification should appear on the screen saying "THANK YOU FOR YOUR ORDER"