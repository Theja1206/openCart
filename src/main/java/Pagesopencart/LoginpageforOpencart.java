package Pagesopencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginpageforOpencart {

	private WebDriver driver;
	
	private By emaillocator=By.name("email");
	private By passwordlocator=By.name("password");
	private By loginbutton=By.xpath("//input[@type='submit']");
	private By forgpwdlink=By.linkText("Forgotten Password");
	private By logout=By.linkText("Logout");
	
	
	public LoginpageforOpencart(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void enteremail(String email)
	{
		WebElement emailIn=driver.findElement(emaillocator);
		emailIn.sendKeys(email);
	}
	
	public void enterpwd(String password)
	{
		WebElement pwdinIn=driver.findElement(passwordlocator);
		pwdinIn.sendKeys(password);
	}
	
	public void clicklogin()
	{
		WebElement logbtn=driver.findElement(loginbutton);
		logbtn.click();
	}
	
//	public void forgotpwd()
//	{
//		WebElement forpwd=driver.findElement(forgpwdlink);
//		forpwd.click();
//	}
	
	public boolean logOut()
	{
		WebElement logot=driver.findElement(logout);
		logot.click();
		return true ;
	}
	
	public void login(String email,String password)
	{
		enteremail(email);
		enterpwd(password);
		clicklogin();
	}
	
//	public String getforgotpwdurl()
//	{
//		String furl=driver.getCurrentUrl();
//		return furl;
//	}
}
