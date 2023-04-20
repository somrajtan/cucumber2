package propertyPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {

	public static Properties getPropertyMethod() throws IOException {
		
		Properties pr=new Properties();
		
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\property.properties" );
		
		FileInputStream fil=new FileInputStream(f);
		pr.load(fil);
		
		return pr;
		
	}
	
}
