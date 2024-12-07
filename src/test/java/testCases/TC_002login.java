package testCases;

import org.testng.Assert;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBases.BaseClass;

public class TC_002login extends BaseClass {
	
	public void verifyLogin()
	{
		logger.info("******** TC002_login started*****");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.myaccount();
		hp.login();
		
		LoginPage lp=new LoginPage(driver);
		lp.emailtxtlogin(p.getProperty("email"));
		lp.passtxtlogin(p.getProperty("password"));
		lp.clicklogin();
		
		
		MyAccountPage map=new MyAccountPage(driver);
		Boolean targetpage=map.myaccount();
		
		Assert.assertTrue(targetpage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("******* TC_002Login Finished");
		
	}
	
	

}
