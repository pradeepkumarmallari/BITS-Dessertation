Feature: Sign In

	Scenario Outline: Validate the <Status> Sign in scenario
	 Given User navigates to the "https://www.flipkart.com" website in "Chrome" browser
	 When User logins <User Name> as username and <Password> as password
	 Then User logins in to application as <Status>
	 	
	 	Examples:
	 		|User Name |Password|Status    |
	 		|9494482457|mpk.7099|Successful|
	 		|9494482487|mpk.0099|Failure   |