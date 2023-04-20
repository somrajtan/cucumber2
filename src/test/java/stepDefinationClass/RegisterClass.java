package stepDefinationClass;

import java.util.Map;

import io.cucumber.java.en.*;

public class RegisterClass {

	
	@Given("user navigate to registration page")
	public void user_navigate_to_registration_page() {
	  
	}

	@When("user enter below details in to the registration page")
	public void user_enter_below_details_in_to_the_registration_page(io.cucumber.datatable.DataTable dataTable) {
	    
	    
		Map<String, String> map = dataTable.asMap(String.class,String.class);
		System.out.println(map.get("firstName"));
		
	}

	@When("select privacy policy field")
	public void select_privacy_policy_field() {
	  
	}

	@When("click on continue button")
	public void click_on_continue_button() {
	    
	}

	@Then("Account get successfully created")
	public void account_get_successfully_created() {
	    
	}
	
}
