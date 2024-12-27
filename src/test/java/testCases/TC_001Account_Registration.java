package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.NewsLetterPage;
import testBases.BaseClass;

public class TC_001Account_Registration extends BaseClass {
	
	
	@Test
	public void verify_account_registration() throws InterruptedException
	{
		try
		{
		
		logger.info("****** Starting TC_001Account_Registration ********");
		AccountRegistrationPage Acp=new AccountRegistrationPage(driver);
		
		
		HomePage hp=new HomePage(driver);
		hp.myaccount();
		hp.register();
		
		
		logger.info("Entering random first name");
		Acp.firstname(randomString().toUpperCase());
		logger.info("Entering random last name");
		Acp.lastname(randomString().toUpperCase());
		
		logger.info("Entering random email");
		
		//Acp.email(p.getProperty("email"));
		Acp.email(alphanumeric()+"gmail.com");
		
		logger.info("Entering random phone no.");
		Acp.phoneno(randomnumber());
		
		
		//Acp.password(p.getProperty("password"));
		
		//Acp.password("storm4@dota2");
		//Acp.confpass(p.getProperty("password"));
		
		
		String combinedpassword=alphanumeric();
		//String combinedpassword2=randomnumber();
		logger.info("Entering Random password");
		//Acp.password(combinedpassword2);
		Acp.password(combinedpassword);
		//Acp.password(alphanumeric());
		logger.info("Entering Random confirm password");
		//Acp.password(alphanumeric());
		Acp.confpass(combinedpassword);
		//Acp.confpass(combinedpassword2);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		
		
		logger.info("clicking subscribe");
		//Acp.SubYes();
		Acp.SubscribeNo();
		logger.info("clicking privacypolicy");
		Acp.privacypolicy();
		
		
		logger.info("clicking continuebutton");
		Acp.continueBtn();
		
		
		
		String confmsg=Acp.getconfirmMsg();
		logger.info("checking confirm messsage");
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
		/*
		NewsLetterPage nlp=new NewsLetterPage(driver);
		logger.info("clicking newsletter");
		nlp.click_newsletter();
		logger.info("checking Subscribed status");
		//boolean status=nlp.SubscribedYes();
		boolean status1=nlp.SubscribedNo();
		Assert.assertEquals(status1, true);
		//Assert.assertEquals(status, true);
		 * */
		 
		
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("Test case finished");
		
		
		
		
		
	}
	

}
