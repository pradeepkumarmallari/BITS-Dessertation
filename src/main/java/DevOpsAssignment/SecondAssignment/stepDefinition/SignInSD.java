package DevOpsAssignment.SecondAssignment.stepDefinition;

import DevOpsAssignment.SecondAssignment.pages.LoginPage;
import io.cucumber.java.en.*;

public class SignInSD {
	LoginPage loginPage;

	public SignInSD() {
		// TODO Auto-generated constructor stub
		loginPage=new LoginPage();
	}
	
	@When("^User logins (.+) as username and (.+) as password$")
    public void user_enters_as_username_and_as_password(String username, String password) throws Throwable {
		loginPage.fillLoginDetails(username, password);
		loginPage.clickLoginButton();
    }
	
	@Then("^User logins in to application as (.+)$")
    public void user_logins_in_to_application_as(String status) throws Throwable {
        loginPage.validateLogin(status);
    }

}
