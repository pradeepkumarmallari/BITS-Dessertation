package bits.dissertation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bits.dissertation.utilities.BaseTestClass;

public class HomePage extends BaseTestClass {
	
	@FindBy(xpath="//div[@class='_6t1WkM _3HqJxg']")
	WebElement homePage;
	
	@FindBy(xpath="//a[@class='_3SkBxJ']")
	WebElement buttonCart;
	
	@FindBy(xpath="//div[@class='_28p97w']")
	List<WebElement> buttonMenu;
	
	@FindBy(xpath="//a[contains(@href,'orders')]")
	WebElement linkOrders;
	
	@FindBy(xpath="//a[contains(@href,'home_account')]")
	WebElement linkProfile;
	
	
	
	public HomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(getDriver(), this);
	}
	
	public void verifyPageLoaded() {
		validateElementPresent(homePage);
	}

}
