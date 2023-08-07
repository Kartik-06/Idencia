package york.idenciaTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {

	public String BaseURL = "https://support5.idencia.net/Account/Login?ReturnUrl=%2f";
	public String Email = "Aman@york.ie";
	public String Password = "12345";
	WebDriver driver;
	
	@BeforeClass
	public void Setup() throws Exception
	{
	System.setProperty("webdriver.gecko.driver","/Users/kartiknagpurkar/Desktop/geckodriver/");
	
		driver = new FirefoxDriver();
		System.out.println("Browser is opened");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximized");
		Thread.sleep(3000);
		
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	
}
