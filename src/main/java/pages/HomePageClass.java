package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitypack.UtilityClass;

public class HomePageClass {
	
	WebDriver driver=null;
	
	UtilityClass utility=new UtilityClass();

	public HomePageClass(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	private WebElement dropdownMyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	private WebElement loginclick;
	
	
	
	
	
	public void clickOnMyAccount() {
		
		utility.onclick(dropdownMyAccount);
	}
	
	public void loginClickOption() {
		
		utility.onclick(loginclick);
	}
	
	
}
