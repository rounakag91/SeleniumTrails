package SeleniumGuru99.Banking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util {
	static WebDriver driver;
	static String userName = "mngr129320";
	static String password = "yqEgEsY" ;
	final static String baseUrl = "http://www.demo.guru99.com/V4/";
    final static String CHROME_PATH = "/Users/rounak-2488/Documents/Personal/Selenium Tutorial/jars/chromedriver";


	public static WebDriver selectBrowser(String bro)
	{
		
		if(bro.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", CHROME_PATH);

			driver = new ChromeDriver();
		}
		
		
		return driver;
	}

	
	
		//Login Page
		final static String userPO = "//input[@name='uid']";
		final static String pwdPO = "[name='password']";
		final static String loginBtn = "btnLogin";
		
		//
		
		
	}

