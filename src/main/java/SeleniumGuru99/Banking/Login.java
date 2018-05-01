//http://www.demo.guru99.com/V4/

package SeleniumGuru99.Banking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import junit.framework.Assert;

public class Login extends Util
{
	static String expectedTitle;
	static String actualTitle;
	static WebDriver driver;
	
	public static void login(WebDriver driver, String userName, String password)
	{

	    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    	driver.manage().window().maximize();
	    	driver.get(baseUrl);
	    	//driver.navigate().to(baseUrl);

	    	WebElement user = driver.findElement(By.xpath(userPO));
	    	user.clear();
	    	
			user.sendKeys(userName );
	    	//WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
	    	WebElement pwd = driver.findElement(By.cssSelector(pwdPO));
	    	pwd.clear();
	    	
			pwd.sendKeys(password );
	    	
			driver.findElement(By.name(loginBtn)).click();
			//OR
			//driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
			
			expectedTitle = "Guru99 Bank Manager HomePage";
	    	actualTitle = driver.getTitle();
	    	
	    	Assert.assertEquals(expectedTitle, actualTitle);
	    	 if (actualTitle.contentEquals(expectedTitle)){
	             System.out.println("Login Successful");
	         } else {
	             System.out.println("Login Failed");
	         }
	}

    
}
