package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import testBases.BaseClass;

public class TS_003Logout extends BaseClass {
	@Test
	public void verifyLogout() throws InterruptedException
	{
		try {
		logger.info("**** Logout started **** ");
		HomePage hp=new HomePage(driver);
		hp.myaccount();
		hp.login();
		
		LoginPage lp=new LoginPage(driver);
		
		logger.info("**** Entering Email and password **** ");
		lp.emailtxtlogin(p.getProperty("email"));
		lp.passtxtlogin(p.getProperty("password"));
		lp.clicklogin();
		logger.info("**** Logged in **** ");
		Thread.sleep(2000);
		
		logger.info("**** Logging out **** ");
		LogoutPage Lop=new LogoutPage(driver);
		
		Lop.MyaccountDropmenu();
		
		//Lop.Logouttopmenu();
		Lop.LogoutCol();
		
		Lop.ContinueLogout_btn();
		
		Assert.assertTrue(true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
