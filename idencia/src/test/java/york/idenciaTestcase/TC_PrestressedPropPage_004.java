package york.idenciaTestcase;

import org.testng.annotations.Test;

import york.idenciapageobjects.HicamsSettingsPage;
import york.idenciapageobjects.Homepompage;
import york.idenciapageobjects.Signinpage;

public class TC_PrestressedPropPage_004 extends Baseclass

{
    @Test
    public void PrestressedPropPage() throws Exception
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
				
		york.idenciapageobjects.PrestressedPropPage Pr = new york.idenciapageobjects.PrestressedPropPage(driver);
		
		Pr.clickPrestressed();
		System.out.println("clicked on prestressed");
		Thread.sleep(3000);
		
		Pr.ClickPlantiDProp();
		System.out.println("clicked on Plant Id Prop");
        Thread.sleep(3000);
        
        Pr.SelectPmaterial();
        System.out.println("Selected material option");
        Thread.sleep(3000);
    	
        Pr.clickConcreteMixProp();
        System.out.println("Clicked on Concrete Mix");
        Thread.sleep(3000);
        
        Pr.SelectAge();
        System.out.println("Selected Age Option");
        Thread.sleep(3000);
        
        Pr.clickPourDate();
        System.out.println("clciked on pourdate");
        Thread.sleep(3000);
        
        Pr.Selectbreakdate();
        System.out.println("Selected Break Date");
        Thread.sleep(3000);
        
        Pr.clickPournumProp();
        System.out.println("clicked on Pour Number Prop");
        Thread.sleep(3000);
        
        Pr.Selectpournumber();
        System.out.println("selected 39 option");
        Thread.sleep(3000);
        
        Pr.btnSave();
        System.out.println("clicked on Save button");
        Thread.sleep(3000);
        
        
        
    }
		
}
