package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBases.BaseClass;
import utilities.DataProviders;


public class TC_003LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verifyLoginDDT(String email, String passrd,String exp)
	{
		logger.info("******** TC_003LoginDDT Started ******");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.myaccount();
		hp.login();
		
		LoginPage lp=new LoginPage(driver);
		lp.emailtxtlogin(email);
		lp.passtxtlogin(passrd);
		lp.clicklogin();
		
		MyAccountPage map=new MyAccountPage(driver);
		Boolean targetpage=map.myaccount();
		
		if(exp.equalsIgnoreCase("Valid"))
		{
		if(targetpage==true)
		{
			map.logout();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		}
		if(exp.equalsIgnoreCase("invalid"))
		{
			if(targetpage==true)
			{
				map.logout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		
		}
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("******** TC_003LoginDDT finished******");
		
		
		
		
		
		
		
		
	}
	
	
	

}
