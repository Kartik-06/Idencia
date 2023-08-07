package york.idenciapageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepompage {

	WebDriver ldriver;
	
	public Homepompage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy (xpath="(//a[normalize-space()='Integration'])[1]")
	WebElement btnintegration;
	
	public void clickintegration()
	{
		btnintegration.click();
	}
	
	@FindBy (xpath = "//a[normalize-space()='NCDOT HiCAMS']")
	WebElement ncdot;
	
	public void ncdot()
	{
		ncdot.click();
	}
	
	@FindBy (xpath = "//a[normalize-space()='Edit']")
	WebElement btnEDIT;
	
	public void ClickEdit()
	{
		btnEDIT.click();
	}

	@FindBy (xpath = "(//ins[@class='iCheck-helper'])[1]")
	WebElement checkboxEnable;
	
	
	//"//body/div/div/div/div/div/form[1]"
	
	public void TapEnable()
	{
		checkboxEnable.click();
	}
	
	@FindBy (xpath = "(//ins[@class='iCheck-helper'])[1]")
	WebElement uncheckboxEnable;
	
	
	public void unTapEnable()
	{
		uncheckboxEnable.click();
	}

	@FindBy (xpath = "(//div[@role='checkbox'])[2]")
	WebElement checkRestricttoCustomer;
	
	public void clickRestricttocustomer()
	{
		checkRestricttoCustomer.click();
	}
		
	@FindBy (xpath = "(//div[@role='checkbox'])[2]")
	WebElement uncheckRestricttoCustomer;
	
	public void untapRestricttocustomer()
	{
		checkRestricttoCustomer.click();
	}
	
	
	
	
	}
	
	


