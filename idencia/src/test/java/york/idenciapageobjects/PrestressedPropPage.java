package york.idenciapageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestressedPropPage {
	
	WebDriver ldriver;

	public PrestressedPropPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	


	@FindBy (xpath = "//option[@value='Prestressed']")
	WebElement btnPrestressed;
	
	public void clickPrestressed()
	{
		btnPrestressed.click();
	}
	
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/select[1]")
	WebElement ClickPlantIDProp;
	
	public void ClickPlantiDProp()
	{
		ClickPlantIDProp.click();
	}
	
	
	@FindBy (xpath = "//select[@id='PlantIdPropertyId']//option[@value='804ef93d-4fba-42cd-a6eb-c65d2fe6fb19'][normalize-space()='Material']")
	WebElement Selectpmaterial;
	
	public void SelectPmaterial()
	{
		Selectpmaterial.click();
	}
	
	 @FindBy (xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[9]/div[2]/select[1]")
	    WebElement clickConcreteMixProp;
	    
	    public void clickConcreteMixProp()
	    {
	    	clickConcreteMixProp.click();
	    }
	 
	    @FindBy (xpath = "//select[@id='ConcreteMixPropertyId']//option[@value='c0170d5c-74bc-43b1-bde2-2c008ec83317'][normalize-space()='Age']")
	    WebElement SelectAge;
	    
	    public void SelectAge()
	    {
	    	SelectAge.click();
	    }
	    
	    
	    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[10]/div[2]/select[1]")
	    WebElement clickPourdateProp;
	    
	    public void clickPourDate()
	    {
	    	clickPourdateProp.click();
	    }
	    
	    
	    @FindBy (xpath = "//option[@value='3293d5e2-d579-4b36-bdda-f04776c9fd29']")
	    WebElement SelectBreakdate;
	    
	    public void Selectbreakdate()
	    {
	    	SelectBreakdate.click();
	    }
	    
	    
	    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[11]/div[2]/select[1]")
	    WebElement clickPournumProp;
	    
	    public void clickPournumProp()
	    {
	    	clickPournumProp.click();
	    
	    }
	    
	    @FindBy (xpath = "//option[@value='f7ca9545-dfcb-4e66-977c-17376d29050d']")
	    WebElement Select39;
	    
	    public void Selectpournumber()
	    {
	    	Select39.click();
	    }
	    
	    

	    @FindBy (xpath = "(//button[normalize-space()='Save'])[1]")
	    WebElement btnSave;
	    
	    public void btnSave()
	    {
	    	btnSave.click();
	    }
	

	
}
