package york.idenciaTestcase;

import org.testng.annotations.Test;
import org.testng.Assert;
import york.idenciapageobjects.Signinpage;

public class TC_SigninTest_001 {
	
	public class TCSigninTest_001 extends Baseclass 
	{
		
		
		@Test
		public void SigninTest() throws InterruptedException
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
		
		
		if(driver.getTitle().equals("idencia"))
		{
			Assert.assertTrue(true);
			
		}
		else 
		{
		   Assert.assertFalse(false);	
			
		}
		
		}

	}
}
