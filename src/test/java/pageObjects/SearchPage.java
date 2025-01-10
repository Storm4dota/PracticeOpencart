package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']") WebElement search_inputtxt;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") WebElement search_btn;
	
	@FindBy(xpath="//p[contains(text(),'iPhone is a revolutionary new mobile phone that al')]") WebElement Iphone_txt;
	
	@FindBy(xpath="//a[normalize-space()='iPhone']") WebElement iphone_click;
	
	@FindBy(xpath="//button[@id='button-cart']") WebElement addcart;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement cartsucc_msg;
	
	@FindBy(xpath="//a[normalize-space()='iMac']") WebElement imac_icon;
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]") WebElement NoProFound;
	
	@FindBy(xpath="\r\n"
			+ "//img[@title='MacBook']\r\n"
			+ "//img[@title='iMac']\r\n"
			+ "//img[@title='MacBook Air']\r\n"
			+ "//img[@title='MacBook Pro']") WebElement multipleProducts;
	public boolean MultiProd()
	{
		return multipleProducts.isDisplayed();
	}
	
	public void searchtxt(String txt)
	{
		search_inputtxt.sendKeys(txt);
	}
	
	public void searchclick()
	{
		search_btn.click();
	}
	
	public String verifymessage()
	{
		try
		{
			return(Iphone_txt.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	public void iphoneclick()
	{
		iphone_click.click();
	}
	
	public void addcartphone()
	{
		addcart.click();
	}
	public boolean imaccheck()
	{
		return imac_icon.isDisplayed();
	}
	public String  sucessmsg()
	{
		
		try {
		return(cartsucc_msg.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		} 
		
				
	}
	
	public boolean NoprodFoundMessage()
	{
		return NoProFound.isDisplayed();
	}
	
	
	

}
