package bits.dissertation.stepDefinition;

import bits.dissertation.pages.LoginPage;
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
	
	@Given("^User Login into the application$")
    public void user_login_into_the_application() throws Throwable {
		loginPage.fillLoginDetails("9494482457", "mpk.7099");
		loginPage.clickLoginButton();
    }

}
