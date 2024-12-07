package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBases.BaseClass;

public class TC_001Account_Registration extends BaseClass {
	
	
	@Test
	public void verify_account_registration() throws InterruptedException
	{
		try
		{
		Thread.sleep(3000);
		logger.info("****** Starting TC_001Account_Registration ********");
		AccountRegistrationPage Acp=new AccountRegistrationPage(driver);
		logger.info("Entering random names");
		
		HomePage hp=new HomePage(driver);
		hp.myaccount();
		hp.register();
		
		
		
		Acp.firstname(randomString().toUpperCase());
		Acp.lastname(randomString().toUpperCase());
		
		logger.info("Entering random email and phone no.");
		Acp.email(alphanumeric()+"gmail.com");
		Acp.phoneno(randomnumber());
		
		String combinedpassword=alphanumeric();
		logger.info("Entering Random password");
		Acp.password(combinedpassword);
		Acp.confpass(combinedpassword);
		
		Acp.SubscribeNo();
		Acp.privacypolicy();
		
		Acp.continueBtn();
		
		String confmsg=Acp.getconfirmMsg();
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test failed..");
			logger.debug("debug logs..");
			Assert.assertTrue(false);
		}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("Test case finished");
		
		
		
		
		
	}
	

}
