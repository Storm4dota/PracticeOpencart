package testCases;

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
		
		
		pcp.ListView_click();
		//pcp.GridView_click();
		//pcp.PC_link_Page();
		pcp.CommonPCclick();
		
		
			
		
		
		Thread.sleep(1000);
		try 
		{
		if(pcp.successMsgPC_displayed()==true) 
		{
		pcp.PCPage_click();
		Assert.assertTrue(true);
		}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	

}
