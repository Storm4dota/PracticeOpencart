package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement MyAcc_Header;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement click_logout;
	
	public boolean  myaccountpage()
	{
		try
		{
			return (MyAcc_Header.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void logout()
	{
		click_logout.click();
	}
	
	
	
	

}
