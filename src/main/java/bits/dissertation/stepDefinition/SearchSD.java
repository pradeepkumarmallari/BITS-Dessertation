package bits.dissertation.stepDefinition;

import bits.dissertation.pages.Search;
import io.cucumber.java.en.*;

public class SearchSD {
	
	Search search;
	public SearchSD() {
		// TODO Auto-generated constructor stub
		search=new Search();
	}
	
	@When("^User serach for \"([^\"]*)\" in the search bar$")
    public void user_serach_for_something_in_the_search_bar(String strArg1) throws Throwable {
        search.searchItem(strArg1);
    }
	
	@Then("^User finds the search results displayed$")
    public void user_finds_the_search_results_displayed() throws Throwable {
        search.validateSearchResuts();
    }

}
