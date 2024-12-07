package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[@title='My Account']") WebElement click_Myaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement click_Register;
	
	@FindBy(xpath="//a[normalize-space()='Login']") WebElement click_login;
	
	
	public void myaccount()
	{
		click_Myaccount.click();
	}
	public void register()
	{
		click_Register.click();
	}
	public void login()
	{
		click_login.click();
	}
	
	

}
