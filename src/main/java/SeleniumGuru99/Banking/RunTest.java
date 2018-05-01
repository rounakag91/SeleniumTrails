package SeleniumGuru99.Banking;

import org.openqa.selenium.WebDriver;


public class RunTest extends Util {

public static void main(String args[])
{
	
	WebDriver driver;
	
	/*    	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	capabilities.setCapability("marionette", true);
	capabilities.setBrowserName("firefox");
	capabilities.setPlatform(Platform.MAC);*/
	
	
	driver = Util.selectBrowser("firefox");  //allowed Values = [firefox|chrome|ie]
	
	Login.login(driver, userName, password);

    
	driver.quit();
	
	
	
}

}
