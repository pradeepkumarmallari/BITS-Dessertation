package bits.dissertation.pages;

import org.openqa.selenium.support.PageFactory;

import bits.dissertation.utilities.BaseTestClass;

public class HomePage extends BaseTestClass {

	public HomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(getDriver(), this);
	}

}
