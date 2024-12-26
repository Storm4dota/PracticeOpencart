package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBases.BaseClass;

public class TC_002login extends BaseClass {
	
	
	@Test
	public void verifyLogin()
	{
		logger.info("******** TC002_login started*****");
		try
		{
		HomePage hp=new HomePage(driver);
		logger.info("clicking my account");
		hp.myaccount();
		logger.info("clicking my login");
		hp.login();
		
		LoginPage lp=new LoginPage(driver);
		logger.info("entering email");
		lp.emailtxtlogin(p.getProperty("email"));
		logger.info("entering password");
		lp.passtxtlogin(p.getProperty("password"));
		logger.info("clicking login button");
		lp.clicklogin();
		//lp.clicklogin();
		//lp.clicklogin();
		//lp.clicklogin();
		//lp.clicklogin();
		//lp.clicklogin();
		
		
		MyAccountPage map=new MyAccountPage(driver);
		logger.info("checking Myaccountpage header");
		Boolean targetpage=map.myaccountpage();
		
		Assert.assertTrue(targetpage);
		}
		catch(Exception e)
		{
			Assert.fail();
			logger.info("login failed");
		}
		logger.info("******* TC_002Login Finished");
		
	}
	
	

}
