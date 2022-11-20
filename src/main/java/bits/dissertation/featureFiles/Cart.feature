Feature: Cart
	
	@Automated @Regression
	Scenario: Validate user navigates to Cart screen
	 Given User navigates to the "https://www.flipkart.com" website in "Chrome" browser
	 And User Login into the application
	 When User navigates to Cart screen
	 Then User lands on the Cart screen