package bits.dissertation.stepDefinition;

import bits.dissertation.pages.Profile;
import io.cucumber.java.en.*;

public class ProfileSD {
	Profile profile;
	public ProfileSD() {
		// TODO Auto-generated constructor stub
		profile=new Profile();
	}
	
	@When("^User navigates to profile screen$")
    public void user_navigates_to_profile_screen() throws Throwable {
		profile.openPage();
    }

    @Then("^User lands on the profile screen$")
    public void user_lands_on_the_profile_screen() throws Throwable {
    	profile.verifyPageLoaded();
    }

}
