package york.idenciaTestcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import york.idenciapageobjects.HicamsSettingsPage;
import york.idenciapageobjects.Homepompage;
import york.idenciapageobjects.Signinpage;

public class TC_HiCAMSSettings_003 extends Baseclass {
	
	@Test
	public void HomepageTest() throws Exception

	{
		driver.get("https://support5.idencia.net/Account/Login?ReturnUrl=%2f");
		System.out.println("Idencia support web Application is opened");
		Thread.sleep(3000);
		
		Signinpage lp = new Signinpage(driver);
		
		lp.setEmail();
		System.out.println("email is entered");
		Thread.sleep(3000);
		
		lp.setPassword();
		System.out.println("Password is entered");
		Thread.sleep(3000);
		
		lp.clicksignin();
		System.out.println("Sign-in button is clicked");
		Thread.sleep(3000);
		
		
		
		Homepompage Hp =new Homepompage(driver);
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;

	    //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    
	    
		Hp.clickintegration();
		System.out.println("Integration button is Clicked");
		Thread.sleep(3000);
		
	    Hp.ncdot();
	    System.out.println("Ncdot button is clicked");
	    Thread.sleep(3000);
	    
		Hp.ClickEdit();
		System.out.println("Edit Button is clicked ");
		Thread.sleep(3000);
		
		Hp.TapEnable();
		System.out.println("Enable Button is tapped");
		Thread.sleep(3000);
		
		Hp.unTapEnable();
		System.out.println("Enable button is Double Clicked");
		Thread.sleep(3000);
	
		Hp.clickRestricttocustomer();
		System.out.println("clicked on Restrict to customer");
		Thread.sleep(3000);
		
		Hp.untapRestricttocustomer();
		System.out.println("double clicked on Restrict to Customer");
		Thread.sleep(3000);
		
		
		HicamsSettingsPage Hs = new HicamsSettingsPage(driver);
		
	    Hs.clickRestricttoCustomer();
	    System.out.println("Clicked on restrict to customer");
	    Thread.sleep(3000);
	    
	    Hs.clickTestcustomer1();
	    System.out.println("clicked on Test Customer 1");
	    Thread.sleep(3000);
	    
	    Hs.ClickProducer();
	    System.out.println("clicked on Producer");
	    Thread.sleep(3000);
	    
	    Hs.clickboth();
	    System.out.println("clicked on both");
	    Thread.sleep(3000);
	    
	    Hs.clickPrecast();
	    System.out.println("clicked on Precast");
	    Thread.sleep(3000);
	    
	    Hs.clickPrestressed();
	    System.out.println("clicked on Prestressed button");
	    Thread.sleep(3000);
	    
	    Hs.clickPrecast();
	    System.out.println("clicked on Precast");
	    Thread.sleep(3000);
	    
	    Hs.ClickItemtype();
	    System.out.println("Clicked on Item Type");
	    Thread.sleep(3000);
	    
	    Hs.SelectConcreteTest();
	    System.out.println("Concrete Test Selected");
	    Thread.sleep(3000);
	    
	    Hs.ClickPlantIDProp();
	    System.out.println("Clicked on PlantID Property");
	    Thread.sleep(3000);
	    
	    Hs.SelectMixdesign();
	    System.out.println("Mix Design option Selected");
	    Thread.sleep(3000);
	    
	    Hs.clickmaterialdescrprop();
	    System.out.println("Clicked on Material Descrip. Property");
	    Thread.sleep(3000);
	    
	    Hs.SelectMaterial();
	    System.out.println("Selected Material Option");
	    Thread.sleep(3000);
	  
	    Hs.ClickMaterialIDProp();
	    System.out.println("clicked on material ID Prop");
	    Thread.sleep(3000);
	    
	    
	    Hs.SelectWeight();
	    System.out.println("selected width option");
	    Thread.sleep(3000);
	    
	    Hs.ClickMaterialtypeIDProp();
	    System.out.println("clicked on Material type ID Prop");
	    Thread.sleep(3000);
	    
	    Hs.SelectDesignlength();
	    System.out.println("selected Design length option");
	    Thread.sleep(3000);
	    
	    Hs.clickconcreteMixProp();
	    System.out.println("clicked on the concrete Mix prop");
	    Thread.sleep(3000);
	    
	    
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    
	    
	    System.out.println("Page is scrolled down");
	    
	    
	    Hs.SelectconcreteMix();
	    System.out.println("selected concrete mix option");
	    Thread.sleep(3000);

	    
	    Hs.clickPourDate();
	    System.out.println("clicked o pour date prop");
	    Thread.sleep(3000);
	    
	    Hs.Selectpourdate();
	    System.out.println("Selected pour date option");
	    Thread.sleep(3000);
	    
	    Hs.clickpournumProp();
	    System.out.println("clicked on pournum prop");
	    Thread.sleep(3000);
	    
	    Hs.Selectpournumber();
	    System.out.println("Selected Pour number option");
	    Thread.sleep(3000);
	    
	    Hs.clickaircontentProp();
	    System.out.println("clicked on Air content prop");
	    Thread.sleep(3000);
	    
	    Hs.selecttextprop();
	    System.out.println("Selected textprop option");
	    Thread.sleep(3000);
	    
	    Hs.clickSlumpProp();
	    System.out.println("clicked on slump prop");
	    Thread.sleep(3000);
	    
	    Hs.SelectStatusoption();
	    System.out.println("Selected status option");
	    
	    Hs.clickSpread();
	    System.out.println("Clicked on Spread prop");
	    Thread.sleep(3000);
	    
	    Hs.SelectItemstatus();
	    System.out.println("Selected item status option");
	    Thread.sleep(3000);
	    
	    Hs.clickflowjring();
	    System.out.println("clicked on flow j ring prop");
	    Thread.sleep(3000);
	    
	    Hs.selectNCRtype();
	    System.out.println("selected NCR Type option");
	    Thread.sleep(3000);
	    
	    Hs.clickflowLring();
	    System.out.println("clicked on Click flow L ring");
	    Thread.sleep(3000);
	    
	    Hs.selectshipmentnum();
	    System.out.println("Selected Shipment number option");
	    Thread.sleep(3000);
	    
	    Hs.btnSave();
	    System.out.println("clicked o save button");
	    Thread.sleep(3000);
	    
	    
	}
	


}
