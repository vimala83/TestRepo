package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSD {

	
	
	WebDriver driver;
	
	 LoginPage loginPage;

	@Before
	public void Setup()
	{
	
		driver = DriverFactory.getDriver("chrome");
		
		loginPage = new LoginPage(driver);
		
	}
	
	//@And("user enters valid user name and password")
	//public void Valid_user_name_and_password() {
	//	loginPage.EnterUserName();
	//	loginPage.EnterPassword();
	//}
		
	@And("when user click enter")
	public void when_user_click_enter() {
		loginPage.clickSubmit();	
	}
	
	@Then("user should be able to see logged in message")
	public void user_should_be_able_to_see_logged_in_message() {
		loginPage.ValidateloggedInMsg();
	}
	
	@And("User clicks on signout button")
	public void user_clicks_on_signout_button() {
		loginPage.signout();
	}
	
	@When("User enters valid username and password")
	public void User_enters_valid_username_and_password() {
		loginPage.EnterCustomUserName("testuser2211");
		loginPage.EnterCustomPassword("Ninja@123");
	}
	//@And("user enters valid user name2 and password2")
	//public void Valid_user_name2_and_password2() {
	//	loginPage.EnterUserName2();
	//	loginPage.EnterPassword2();
	//}
	
	@And("^user enters valid \"(.*)\" and \"(.*)\"")
	public void Valid_custom_user_name_and_password(String username,String password) throws Throwable
	{
		loginPage.EnterCustomUserName(username);
		loginPage.EnterCustomPassword(password);
	}
	
	}

