package pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignInPage {
	
	WebDriver driver;
	
	//@FindBy(xpath = "//button[text()='Get Started']") WebElement getStartedBtn;
	
	public SignInPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void VerifySignInPageURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/login");
	}
	

}
