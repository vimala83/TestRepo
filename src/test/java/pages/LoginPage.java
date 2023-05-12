package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	@FindBy(xpath = "//a[@href='/login']") WebElement signInBtn;
	@FindBy(xpath = "//input[@name='username']")WebElement userName;
	@FindBy(xpath = "//input[@name='password']")WebElement userPassword;
	@FindBy(xpath = "//input[@value='Login']")WebElement clicksubmit;
	@FindBy(xpath = "//a[@href='/logout']")WebElement signout;
	@FindBy(xpath = "//div[@class='alert alert-primary']") WebElement LoggedInMsg;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	
	public void clickonLoginpage() {
		
		signInBtn.click();	
	}
		
	public void EnterUserName() {
		userName.sendKeys("vimala.r.senthil@gmail.com");
		
	}
			
	public void EnterPassword() {
		userPassword.sendKeys("vimala@29aug");
		
	}
	
	public void clickSubmit() {
		clicksubmit.click();
	}
	
	public void ValidateloggedInMsg() {
		Assert.assertEquals(LoggedInMsg.getText(), "You are logged in");
	}
	
	public void signout() {
		signout.click();
		
	}
		
	public void EnterUserName2() {
		userName.sendKeys("testuser2211");
		
	}
			
	public void EnterPassword2() {
		userPassword.sendKeys("Ninja@123");
		
	}
	
	public void EnterCustomUserName(String username) {
		userName.sendKeys(username);
		
	}
	public void EnterCustomPassword(String p1) {
		userPassword.sendKeys(p1);

	}
	
	
	
	}

	
	
	
	
	


