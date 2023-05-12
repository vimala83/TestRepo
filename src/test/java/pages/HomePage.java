package pages;



import org.openqa.selenium.WebDriver;
//import utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[@href='/login']") WebElement loginBtn;
	@FindBy(xpath = "//a[@href='data-structures-introduction']") WebElement dataStructureBtn;
	@FindBy(xpath = "//div[contains(@class, 'alert')]") WebElement errorMsg;
	@FindBy(xpath = "//button") WebElement getStartedBtn;
	@FindBy(xpath = "//a[@href='/register']") WebElement registerBtn;
	@FindBy(xpath = "//a[@href='/login']") WebElement signInBtn;
	@FindBy(xpath = "//a[contains(text(),'Data Structures')]") WebElement DataStructuresBtn ;
	@FindBy(xpath = "//a[@href='data-structures-introduction']") WebElement dataStructureGetStartedBtn;
	@FindBy(xpath = "//div[contains(@class, 'alert alert-primary')]") WebElement validateErrorMsg;
	@FindBy(xpath = "//a[@href=\"array\"]") WebElement ArrayGetStartedBtn;
	@FindBy(xpath = "//div[contains(@class,\"alert alert-primary\")]") WebElement ValidateArrayErrorMsg;
	@FindBy(xpath = "//a[@href=\"linked-list\"]") WebElement LinkedListGetStartedBtn;
	@FindBy(xpath = "//div[contains(@class,\"alert alert-primary\")]") WebElement ValidateLinkedListErrorMsg;
	@FindBy(xpath = "//a[@href=\"stack\"]") WebElement StackGetStartedBtn;
	@FindBy(xpath = "//a[@href=\"queue\"]") WebElement QueueGetStartedBtn;
	@FindBy(xpath = "//a[@href=\"tree\"]") WebElement TreeGetStartedBtn;
	@FindBy(xpath = "//a[@href=\"graph\"]") WebElement GraphGetStartedBtn;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public void VerifyHomePageURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/home");
	}
	
	public void VerifyGetStartedButton() {
		
		Assert.assertEquals(getStartedBtn.getText(), "Get Started");
	
	}
	
	public void ClickOnRegisterBtn()
	{
		registerBtn.click();
	}
	
	public void Register() {
		
		Assert.assertEquals(registerBtn.getText(), "register");
	
	}
	
	public void ClickOnSignInBtn()
	{
		signInBtn.click();
	}
	
	public void SignIn() {
		
		Assert.assertEquals(signInBtn.getText(), "Sign In");
	
	}

	public void VerifyNotLoggedIn()
	{
		Assert.assertEquals(loginBtn.getText(), "Sign in");
	}

	public void ClickOnDataStructures()
	{
		dataStructureBtn.click();
	}
	
	public void validateErrorMsg()
	{
		Assert.assertEquals(errorMsg.getText(), "You are not logged in");
		
	}
	
	public void ClickOnArray()
	{
		ArrayGetStartedBtn.click();
	}
	
	public void ClickonArrayGetStartedBtn() {
		ArrayGetStartedBtn.click();
	}
	
	public void ValidateArrayErrorMsg() {
		Assert.assertEquals(errorMsg.getText(), "You are not logged in");
	}
	
	public void ClickonLinkedListGetStartedBtn() {
		LinkedListGetStartedBtn.click();
	}
	
	public void ValidateLinkedListErrorMsg() {
		Assert.assertEquals(errorMsg.getText(), "You are not logged in");
	}
	
	public void ClickonStackGetStartedBtn() {
		StackGetStartedBtn.click();
	}
	
	public void ClickonQueueGetStartedBtn() {
		StackGetStartedBtn.click();
	}
	
	public void ClickonTreeGetStartedBtn() {
		StackGetStartedBtn.click();
	}
	
	public void ClickonGraphGetStartedBtn() {
		StackGetStartedBtn.click();
	}
	
	
	
	
	
	
	
	public void VerifyLoginErrorMsg()
	{
		Assert.assertEquals(errorMsg.getText(), "You are not logged in");
	}
}
