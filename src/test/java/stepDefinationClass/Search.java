package stepDefinationClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hook.Myhook;
import initialBrowser.LaunchBrowse;
import io.cucumber.java.en.*;

public class Search {

	WebDriver driver=LaunchBrowse.getDriver();

	@Given("user navigate to search page")
	public void user_navigate_to_search_page() {
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("hp");
		String hp = driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).getText();

		System.out.println("-----------------------------------------------------------------------");
		System.out.println(hp);
		System.out.println("-------------------------------------------------------------------------");
	}

	@When("user enter valid product name {string}")
	public void user_enter_valid_product_name(String string) {
	    
	}

	@When("click on search button")
	public void click_on_search_button() {
	   
	}

	@Then("user should display search result displed")
	public void user_should_display_search_result_displed() {
	  
	}

	@When("user enter Invalid product name {string}")
	public void user_enter_invalid_product_name(String string) {
	    
	}

	@Then("user should display inform message")
	public void user_should_display_inform_message() {
	   
	}
	
	
}
