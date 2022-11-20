package bits.dissertation.stepDefinition;

import bits.dissertation.pages.Orders;
import io.cucumber.java.en.*;

public class OrdersSD {
	Orders orders;
	public OrdersSD() {
		// TODO Auto-generated constructor stub
		orders=new Orders();
	}
	
	@When("^User navigates to orders screen$")
    public void user_navigates_to_orders_screen() throws Throwable {
        orders.openPage();
    }

    @Then("^User lands on the orders screen$")
    public void user_lands_on_the_orders_screen() throws Throwable {
        orders.verifyPageLoaded();
    }

}
