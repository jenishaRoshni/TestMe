package cucumber12;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ffff {
	@Given("^I have some cakes in my hand$")
	public void i_have_some_cakes_in_my_hand() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Given");
	}

	@When("^I wait some cakes$")
	public void i_wait_some_cakes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("when");
	}

	@Then("^disapper$")
	public void disapper() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("finished");
	}

}
