package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProductComparePage;
import pageObjects.ProductDisplayPage;
import pageObjects.SearchPage;
import testBases.BaseClass;

public class TS_007ProductDisplayPage extends BaseClass{
	@Test
	public void verify_ProductDisplayPage() throws InterruptedException  {
		
		try {
	
	
	SearchPage sp =new SearchPage(driver);
	sp.searchtxt(p.getProperty("searchproductId"));
	sp.searchclick();
	
	ProductDisplayPage pdp=new ProductDisplayPage(driver);
	
	pdp.iMac_click();
	Thread.sleep(3000);
	
	try {
		
	
	Assert.assertEquals(pdp.ProductCode_displayed(), true);
	Assert.assertEquals(pdp.text_brand_displayed(), true);
	
	}
	catch(Exception e)
	{
		Assert.fail();
	}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	
	
	
	
	
	
	
	
	
	}
}
