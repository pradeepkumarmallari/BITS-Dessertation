package bits.dissertation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bits.dissertation.utilities.BaseTestClass;

public class Profile extends BaseTestClass {
	
	@FindBy(xpath="//span[@class='_1mHr1S']")
	WebElement textProfileInformation;

	public Profile() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(getDriver(), this);
	}
	
	public void openPage() {
		threadWait(3000);
		HomePage homePage=new HomePage();
		Actions actions=new Actions(getDriver());
		actions.moveToElement(homePage.buttonMenu.get(0)).build().perform();
		threadWait(2000);
		clickOnElement(homePage.linkProfile);
	}
	
	public void verifyPageLoaded() {
		threadWait(3000);
		Assert.assertTrue(validateElementPresent(textProfileInformation),"Profile page not loaded");
	}
	
	

}
