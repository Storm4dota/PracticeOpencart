package testCases;



import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import testBases.BaseClass;

public class TC_004search extends BaseClass {
	@Test
	public void  verifysearch() throws InterruptedException
	{
		
		
		
		 //logger.info("****** TC_SF_004 started*****");
		logger.info("****** TC_SF_005 started*****");
		
		//TC_SF_004
		    /*
			LoginPage lp =new LoginPage(driver);
			HomePage hp=new HomePage(driver);
			hp.myaccount();
			hp.login();
			
			lp.emailtxtlogin(p.getProperty("email"));
			lp.passtxtlogin(p.getProperty("password"));
			lp.clicklogin();
			*/
			
		
		
		try
		{
		SearchPage sp=new SearchPage(driver);
		
		logger.info("***** Search TestCase started ******");
		
		sp.searchtxt(p.getProperty("searchproductId"));
		sp.searchclick();
		/*
		//TC_SF_003
		try {
			if(sp.NoprodFoundMessage())
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.fail();
			}
		}
			catch(Exception e)
			{
				Assert.fail();
			}
		
			*/
		logger.info("***** TC_SF_006*****");
		try 
		{
		if(sp.MultiProd()) {
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		} 
		}
		catch (Exception e)
		{
			Assert.fail();
		}
			
		/*
		try {
			if(sp.imaccheck()) {
				Assert.assertTrue(true);}
				else
				{
					Assert.fail();
				}
				
			
		}
			catch (Exception e)
			{
				Assert.fail();
			}
			*/
			
			
		/*
		String confirmmsg=sp.verifymessage();
		if(confirmmsg.equals("iPhone is a revolutionary new mobile phone that allows you to make a call by simply tapping a name o.."))
		{
			
			sp.iphoneclick();
			sp.addcartphone();
			//Thread.sleep(3000);
			
				
			String sucMsg=sp.sucessmsg();
			
			
			logger.debug("**** Success message failed *****");
			try {
			if(sucMsg.equalsIgnoreCase("Success: You have added iPhone to your shopping cart!"))  //Success: You have added iPhone to your shopping cart!
			{
				Assert.assertTrue(true);
			}
			
			}
			catch (Exception e)
			{
				Assert.fail();
			} 
			Assert.assertTrue(true);
			
		}
		else
		{
			logger.error("Test failed..");
			logger.debug("debug logs...");
			Assert.assertTrue(false);
		}*/
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		
		
		
		
	}

}
