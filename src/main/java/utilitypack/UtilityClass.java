package utilitypack;

import org.openqa.selenium.WebElement;

public class UtilityClass {
	
	public void onclick(WebElement element) {
		
		element.click();
	}
	
	
   public void onsendKey(WebElement element,String value) {
		
		element.click();
		element.clear();
		element.sendKeys(value);
	}
	

}
