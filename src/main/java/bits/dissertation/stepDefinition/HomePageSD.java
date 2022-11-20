package bits.dissertation.stepDefinition;

import bits.dissertation.pages.HomePage;
import io.cucumber.java.en.*;

public class HomePageSD {
	HomePage homePage;

	public HomePageSD() {
		// TODO Auto-generated constructor stub
		homePage=new HomePage();
	}
	
	@When("^User navigates to Home screen$")
    public void user_navigates_to_home_screen() throws Throwable {
        
    }
	
	@Then("^User lands on the Home screen$")
    public void user_lands_on_the_home_screen() throws Throwable {
        homePage.verifyPageLoaded();
    }

}
