Feature: Search
	
	@Automated @Regression
	Scenario: Validate user navigates to Cart screen
	 Given User navigates to the "https://www.flipkart.com" website in "Chrome" browser
	 And User Login into the application
	 When User serach for "Mobiles" in the search bar
	 Then User finds the search results displayed