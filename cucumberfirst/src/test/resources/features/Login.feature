Feature: Login 
	
	Scenario: In order to verify login to facebook
			Given user navigates to facebook website
			When user validates the homepage title
			Then user entered "valid" username
			And user entered "valid" password
			Then user "shouldbe" successfully logged in 
	
	Scenario: In order to verify login to facebook as Invalid User
			Given user navigates to facebook website
			When user validates the homepage title
			Then user entered "invalid" username
			And user entered "invalid" password
			Then user "shouldnotbe" successfully logged in 
	