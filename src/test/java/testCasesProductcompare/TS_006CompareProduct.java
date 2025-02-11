package testCasesProductcompare;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProductComparePage;
import pageObjects.SearchPage;
import testBases.BaseClass;

public class TS_006CompareProduct extends BaseClass {
	@Test
	public void verifyproductcompare()
	{
		try 
		{
		SearchPage sp=new SearchPage(driver);
		sp.searchtxt(p.getProperty("searchproductId"));
		sp.searchclick();
		
		
		
		ProductComparePage pcp=new ProductComparePage(driver);
		
		
		pcp.CommonPCclick();
		
		
			
		Assert.assertTrue(pcp.successMsgPC_displayed());
		
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	

}
