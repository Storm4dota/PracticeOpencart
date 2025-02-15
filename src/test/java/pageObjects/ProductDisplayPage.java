package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDisplayPage extends BasePage {
	
	public ProductDisplayPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//li[.='Brand: Apple']") WebElement text_brand;
	@FindBy(xpath="//li[normalize-space()='Product Code:Product 14']") WebElement text_ProductCode;
	@FindBy(xpath="//a[normalize-space()='iMac']") WebElement iMac_click;
	
	public boolean text_brand_displayed()
	{
		return text_brand.isDisplayed();
	}
	
	public boolean ProductCode_displayed()
	{
		return text_ProductCode.isDisplayed();
	}
	
	public void iMac_click()
	{
		iMac_click.click();
	}
	

}
