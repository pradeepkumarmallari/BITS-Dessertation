package bits.dissertation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bits.dissertation.utilities.BaseTestClass;

public class Cart extends BaseTestClass {
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	WebElement buttonPlaceOrder;
	
	
	public Cart() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(getDriver(), this);
	}
	
	public void openPage() {
		threadWait(3000);
		HomePage homePage=new HomePage();
		clickOnElement(homePage.buttonCart);
	}
	
	public void verifyPageLoaded() {
		threadWait(3000);
		Assert.assertTrue(validateElementPresent(buttonPlaceOrder),"Cart page not loaded");
	}
	
	

}
