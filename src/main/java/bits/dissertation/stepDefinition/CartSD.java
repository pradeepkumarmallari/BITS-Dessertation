package bits.dissertation.stepDefinition;

import bits.dissertation.pages.Cart;
import io.cucumber.java.en.*;

public class CartSD {
	Cart cart;
	public CartSD() {
		// TODO Auto-generated constructor stub
		cart=new Cart();
	}
	
	@When("^User navigates to Cart screen$")
    public void user_navigates_to_cart_screen() throws Throwable {
		cart.openPage();
    }

    @Then("^User lands on the Cart screen$")
    public void user_lands_on_the_cart_screen() throws Throwable {
    	cart.verifyPageLoaded();
    }

}
