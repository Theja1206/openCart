package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pagesopencart.LoginpageforOpencart;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginopencartstep {
	
	private WebDriver driver;
	private LoginpageforOpencart loginpageforOPencart;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@After
	public void teardown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
	@Given("I am on the Opencart login")
	public void i_am_on_the_opencart_login() {
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    loginpageforOPencart=new LoginpageforOpencart(driver);
	    
	}

	@Given("I have entered a valid username and password")
	public void i_have_entered_a_valid_username_and_password() {
		loginpageforOPencart.enteremail("testcode@yahoo.com");
		loginpageforOPencart.enterpwd("Testpract");
		
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		loginpageforOPencart.clicklogin();
	}

	
	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		boolean val=loginpageforOPencart.logOut();
	   Assert.assertEquals(val,true);
	}

	@Given("I have entered invalid {string} and {string}")
	public void i_have_entered_invalid_and(String string, String string2) {
		loginpageforOPencart.login(string, string2);
	}

	@Then("I should see an error message indicating {string}")
	public void i_should_see_an_error_message_indicating(String string) {
		WebElement errmessage=driver.findElement(By.cssSelector(".alert-danger"));
		Assert.assertEquals(errmessage,true);
	   
	}

}
