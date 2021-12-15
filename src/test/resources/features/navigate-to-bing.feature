@selenium
Feature: Navigate to Bing

	As a user, I want to navigate to Bing so that I can search for things.
	
	Scenario: successfully navigates to bing
		When the user requests https://www.bing.com
		Then the user should be on the Bing home page