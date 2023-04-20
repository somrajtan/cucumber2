package initialBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowse {

	public static WebDriver driver=null;
	
	public static void intialBrowser(String Browser) {
		
		if(Browser=="chrome") {

			 ChromeOptions chromeOptions = new ChromeOptions();
			    chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			     driver =new ChromeDriver(chromeOptions);
			
		}else if(Browser=="edge") {
			
			 driver =new EdgeDriver();
			
		}
		

		
	}
	
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	
	
}
