package bits.dissertation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bits.dissertation.utilities.BaseTestClass;

public class Search extends BaseTestClass {
	
	@FindBy(xpath="//input[contains(@title,'Search')]")
	WebElement textboxSearch;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	WebElement buttonSearch;
	
	@FindBy(xpath="//div[@data-id]")
	List<WebElement> listResults;
	
	public Search() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(getDriver(), this);
	}
	
	public void searchItem(String item) {
		enterText(item, textboxSearch);
		clickOnElement(buttonSearch);
	}
	
	public void validateSearchResuts() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println(listResults);
		Assert.assertTrue(listResults.size()>0,"search rsults validation failed");
	}
	
	

}
