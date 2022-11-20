package bits.dissertation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bits.dissertation.utilities.BaseTestClass;

public class LoginPage extends BaseTestClass {
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement textboxUsername;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement textboxPassword;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement buttonLogin;

	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public void fillLoginDetails(String userName,String password) {
		enterText(userName, textboxUsername);
		enterText(password, this.textboxPassword);
	}
	
	public void clickLoginButton() {
		clickOnElement(buttonLogin);
	}
	
	public void validateLogin(String status) {
		threadWait(3000);
		if(status.equals("Successful")) {
			//Assert.assertEquals(validateElementPresent(textboxUsername), false,"Login test failed");
		}
		else {
			//Assert.assertEquals(validateElementPresent(textboxUsername), true,"Login test failed");
		}
	}

}
