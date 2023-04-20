package hook;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import initialBrowser.LaunchBrowse;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import propertyPack.PropertyClass;

public class Myhook {
   
    
	WebDriver driver;
	
	@Before
	public void beforeScenario() throws IOException  {
		
		Properties prt = PropertyClass.getPropertyMethod();
		LaunchBrowse.intialBrowser("chrome");
         driver = LaunchBrowse.getDriver();

		     driver.get(prt.getProperty("url"));
		     driver.manage().window().maximize();
		    
		
	}
	
	
	@After
	public void afterScenario(Scenario scenario  )  {
		
	
		
		if(scenario.isFailed()) {
			String name = scenario.getName();
			TakesScreenshot ts = (TakesScreenshot) driver;

			byte[] src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", name);
		}
		
		driver.close();
		
	
	
	}
	
}
