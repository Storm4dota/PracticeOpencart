package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchPage;
import testBases.BaseClass;

public class TC_004search extends BaseClass {
	@Test
	public void  verifysearch() throws InterruptedException
	{
		try
		{
		SearchPage sp=new SearchPage(driver);
		
		logger.info("***** Search TestCase started ******");
		
		sp.searchtxt(p.getProperty("searchproductId"));
		sp.searchclick();
		Thread.sleep(3000);
		
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
			else
			{
				Assert.assertTrue(false);
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
		}
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		
		
		
		
	}

}
