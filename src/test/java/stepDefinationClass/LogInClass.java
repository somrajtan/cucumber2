package stepDefinationClass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import hook.Myhook;
import initialBrowser.LaunchBrowse;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePageClass;

public class LogInClass {
	
	
	WebDriver driver=LaunchBrowse.getDriver();
	HomePageClass homepage=new HomePageClass(driver);
	

@Given("user navigate to logIn page")
public void user_navigate_to_log_in_page() {
	
	
	homepage.clickOnMyAccount();
	
	homepage.loginClickOption();
	
	
	System.out.println("1");
	
}


@When("^user enter valid email (.+)$")
   public void user_enter_valid_email(String email) throws Throwable {
	System.out.println("2");
   }

   @And("^valid password (.+)$")
   public void valid_password(String password) throws Throwable {
	   System.out.println("3");
   }
   	

@When("click button")
public void click_button() {
	String login = driver.findElement(By.xpath("//a[@class='btn btn-primary']")).getText();
	System.out.println("..............................................................................");
	System.out.println(login);
    System.out.println(".......................................................................");
}

@Then("user login successful")
public void user_login_successful() {
	 System.out.println("5");
}

@When("user enter Invalid email {string}")
public void user_enter_invalid_email(String string) {
    
}

@When("Invalid password {string}")
public void invalid_password(String string) {
   
}

@Then("user show message")
public void user_show_message() {
	
	
	Assert.assertTrue(false);
  
}





}
