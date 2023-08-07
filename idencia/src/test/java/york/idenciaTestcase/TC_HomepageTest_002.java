package york.idenciaTestcase;

import org.testng.annotations.Test;

import york.idenciapageobjects.Homepompage;
import york.idenciapageobjects.Signinpage;

public class TC_HomepageTest_002 {
	
	public class TCHomepageTest_002 extends Baseclass
	{
		
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
			
		}
		
	}

}
