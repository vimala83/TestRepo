package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyRegisterPageURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/register");
	}
	
	public void VerifySignInPageURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/login");
	}
	
	
}

