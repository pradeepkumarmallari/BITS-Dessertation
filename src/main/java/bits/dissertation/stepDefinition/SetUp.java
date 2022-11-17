package bits.dissertation.stepDefinition;

import bits.dissertation.pages.LoginPage;
import bits.dissertation.utilities.BaseTestClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class SetUp {
	BaseTestClass baseTestClass;

	public SetUp() {
		// TODO Auto-generated constructor stub
		baseTestClass=new BaseTestClass();
	}
	
	@Given("^User navigates to the \"([^\"]*)\" website in \"([^\"]*)\" browser$")
    public void user_navigates_to_the_something_website_in_something_browser(String strArg1, String strArg2) throws Throwable {
		baseTestClass.openBrowser(strArg2, strArg1);
    }
	
	@After
	public void closeBrowser() {
		baseTestClass.closeBrowser();
	}
	
	@AfterStep
	public void afterStep(Scenario sc) {
		baseTestClass.takeScreenshot(sc);
	}

}
