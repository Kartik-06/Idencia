package york.idenciapageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {

	WebDriver ldriver;
	
	public Signinpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (id="Email")
	WebElement TxtEmail;
	
	@FindBy (id="Password")
	WebElement TxtPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnSignin;
	
	
	
	public void setEmail ()
	{
		TxtEmail.sendKeys("Aman@york.ie");
	}
	
	public void setPassword ()
	{
		TxtPassword.sendKeys("12345");
	}
	
	public void clicksignin ()
	{
		btnSignin.click();
	}
	
}
