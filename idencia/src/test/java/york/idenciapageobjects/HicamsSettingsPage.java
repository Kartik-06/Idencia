package york.idenciapageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HicamsSettingsPage {
	
	WebDriver ldriver;
	
	public HicamsSettingsPage (WebDriver rdriver) 
	
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
		
	
     @FindBy (xpath = "(//select[@id='CustomerId'])[1]")
     WebElement btnRestricttoCustomer;
   
    public void clickRestricttoCustomer() 
    {
    	btnRestricttoCustomer.click();
    }
    
     
    @FindBy (xpath="//option[@value='e6792d3e-aff0-456c-9a91-5922c540016b']")
	WebElement btnTestcustomer1;
	
	public void clickTestcustomer1()
	{
		btnTestcustomer1.click();
	}
     
	
	@FindBy (xpath = "//select[@id='ProducerType']")
	WebElement btnProducer;
	
	public void ClickProducer() 
	{
		btnProducer.click();
	}
 
	
	@FindBy (xpath = "//option[@value='Both']")
	WebElement btnboth;
	
	public void clickboth()
	{
		btnboth.click();
	}
	
	
	@FindBy (xpath = "//option[@value='Precast']")
	WebElement btnPrecast;
	
	public void clickPrecast()
	{
		btnPrecast.click();
	}
	
	
	@FindBy (xpath = "//option[@value='Prestressed']")
	WebElement btnPrestressed;
	
	public void clickPrestressed()
	{
		btnPrestressed.click();
	}
	
	
	@FindBy (xpath = "(//select[@id='ItemTypeId'])[1]")
	WebElement btnItemtype;
	
	public void ClickItemtype()
	{
		btnItemtype.click();
	}
	
	
	@FindBy (xpath = "(//option[@value='114cd7c1-f743-4954-9ec0-6a8dde169174'])[1]")
	WebElement selectConcreteTest;
	
	public void SelectConcreteTest()
	{
		selectConcreteTest.click();
	}
	
	
	@FindBy (xpath = "(//select[@id='PlantIdPropertyId'])[1]")
	WebElement ClickPlantIDProp;
	
	public void ClickPlantIDProp()
	{
		ClickPlantIDProp.click();
	}
	
	
	@FindBy (xpath = "(//option[@value='9762b8f5-7155-4fa8-99a6-b18a320e3aad'][normalize-space()='Mix Design'])[1]")
	WebElement SelectMixdesign;
	
	public void SelectMixdesign()
	{
		SelectMixdesign.click();
	}
	
	
	@FindBy (xpath = "(//select[@id='MeterialDescPropertyId'])[1]")
	WebElement ClickMaterialDescrProp;
	
	public void clickmaterialdescrprop()
	{
		ClickMaterialDescrProp.click();
	}
	
	
	@FindBy (xpath = "(//option[@value='804ef93d-4fba-42cd-a6eb-c65d2fe6fb19'][normalize-space()='Material'])[2]")
	WebElement SelectMaterial;
	
	public void SelectMaterial()
	{
		SelectMaterial.click();
	}
	
	
    @FindBy (xpath = "(//select[@data-val-requiredif='The Meterial ID Property field is required.'])[1]")
    WebElement ClickMaterialIDProp;
	
    public void ClickMaterialIDProp()
    {
    	ClickMaterialIDProp.click();
    }
    
    
    @FindBy (xpath = "(//option[@value='97ea5543-7589-4eeb-906b-3a7b6dfe6ca1'])[1]")
    WebElement SelectWeight;
 
    public void SelectWeight()
    {
    	SelectWeight.click();
    }
    
    
    @FindBy (xpath = "(//select[@data-val-requiredif='The Meterial Type ID Property field is required.'])[1]")
    WebElement clickMaterialtypeIDProp;
    
    public void ClickMaterialtypeIDProp()
    {
    	clickMaterialtypeIDProp.click();
    }
    
    
    @FindBy (xpath = "(//option[@value='8b658575-e760-45ad-84c0-481d36742106'])[2]")
    WebElement SelectDesignlength;
    
    public void SelectDesignlength()
    {
    	SelectDesignlength.click();
    }
    
    
    @FindBy (xpath = "(//select[@data-val-required='The Concrete Mix Property field is required.'])[1]")
    WebElement clickconcreteMixProp;
    
    public void clickconcreteMixProp()
    {
    	clickconcreteMixProp.click();
    }
 
    @FindBy (xpath = "(//option[@value='1b30eeb6-f041-45d7-ae7d-e21707b5b601'])[1]")
    WebElement SelectconcreteMix;
    
    public void SelectconcreteMix()
    {
    	SelectconcreteMix.click();
    }
    
  
    
    @FindBy (xpath = "//select[@data-val-required='The Pour Date Property field is required.']")
    WebElement clickpourdateProp;
    
    public void clickPourDate()
    {
    	clickpourdateProp.click();
    }
    
    
    @FindBy (xpath = "//option[@value='01031589-f719-44b5-87d0-e9464343fe1a']")
    WebElement Selectpourdate;
    
    public void Selectpourdate()
    {
    	Selectpourdate.click();
    }
    
    
    @FindBy (xpath = "//option[@value='3c6bae4d-3c34-4d53-ab73-24f121ce8d6c']")
    WebElement clickPournumProp;
    
    public void clickpournumProp()
    {
    	clickPournumProp.click();
    
    }
    
    @FindBy (xpath = "(//option[@value='b8def9d1-e291-4d36-a4e0-3c2d8867aab2'])[1]")
    WebElement Selectpournumber;
    
    public void Selectpournumber()
    {
    	Selectpournumber.click();
    }
    
    @FindBy (xpath = "(//select[@data-val-requiredif='The Air Content Property field is required.'])[1]")
    WebElement clickaircotentProp;
    
    public void clickaircontentProp()
    {
    	clickaircotentProp.click();
    }
    
    @FindBy (xpath = "(//option[@value='7b417b3e-2a69-4828-874f-29fa9e5949db'])[2]")
    WebElement SelectStatusoption;
    
    public void SelectStatusoption()
    {
    	SelectStatusoption.click();
    }
    
    
    @FindBy (xpath = "(//select[@data-val-requiredif='The Slump Property field is required.'])[1]")
    WebElement ClickSlumpprop;
    
    public void clickSlumpProp()
    {
    	ClickSlumpprop.click();
    }
    
    
    @FindBy (xpath = "(//option[@value='3444d04d-b403-4076-9bf7-17d1ce01a88d'])[3]")
    WebElement SelectTextprop;
    
    public void selecttextprop()
    {
    	SelectTextprop.click();
    }
    
    @FindBy (xpath = "(//select[@data-val-requiredif='The Spread Property field is required.'])[1]")
    WebElement clickspreadprop;
    
    public void clickSpread()
    {
    	clickspreadprop.click();
    }
    
    @FindBy (xpath = "(//option[@value='705e3852-895b-4470-80aa-f50b9d93d478'])[4]")
    WebElement SelectItemstatus;
    
    public void SelectItemstatus()
    {
    	SelectItemstatus.click();
    }
    
    
    @FindBy (xpath = "(//select[@data-val-requiredif='The Flow - J Ring Property field is required.'])[1]")
    WebElement clickFlowjring;
    
    public void clickflowjring()
    {
    	clickFlowjring.click();
    }
    
    
   @FindBy (xpath = "(//option[@value='f7eb0537-4ba9-4739-9b23-70f22df4ad26'])[5]") 
   WebElement SelectNCRtype;
   
   public void selectNCRtype()
   {
	   SelectNCRtype.click();
   }
    
    @FindBy (xpath = "(//select[@data-val-requiredif='The Flow - L Box Property field is required.'])[1]")
    WebElement clickflowlring;
    
    public void clickflowLring()
    {
    	clickflowlring.click();
    }
    
    @FindBy (xpath = "(//option[@value='f2e887c5-6346-42b8-84c7-1d5238db9cf4'])[6]")
    WebElement Selectshipmentnum;
    
    public void selectshipmentnum()
    {
    	Selectshipmentnum.click();
    }
    
    @FindBy (xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSave;
    
    public void btnSave()
    {
    	btnSave.click();
    }
    
    
}

