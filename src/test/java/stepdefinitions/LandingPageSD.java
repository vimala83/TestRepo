package stepdefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LandingPage;
import utils.DriverFactory;
public class LandingPageSD {

	WebDriver driver;
	
	LandingPage landingPage;

	
	@Before
	public void Setup()
	{
		driver = DriverFactory.getDriver("chrome");
		
		landingPage = new LandingPage(driver);
		
	}
	
	@Given("User on DS algo landing page")
	public void User_on_ds_algo_landing_page() {
	    driver.get("https://dsportalapp.herokuapp.com");
	}

	@When("User click on Get Started button")
	public void User_click_on_Get_started_button() {
		landingPage.ClickOnGetStarted();
	}
	public static void click() {
		// TODO Auto-generated method stub
		
	}

	public static void clickongetstartedbutton() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
