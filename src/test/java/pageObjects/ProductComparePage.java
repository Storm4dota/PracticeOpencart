package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ProductComparePage extends BasePage {
	
	public ProductComparePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Product Comparison']") WebElement BreadcrumbProductcompare;
    @FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[3]//button[3]//i[1]") WebElement Productcompare;
    @FindBy(xpath="//i[@class='fa fa-exchange']") WebElement CommonProductcompareEle;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement SuccessMessageProductcompare;
    
    public void breadPCclick()
    {
    	BreadcrumbProductcompare.click();
    }
    
    public void HomepagePCclick()
    {
    	Productcompare.click();
    }
    
    public void CommonPCclick()
    {
    	CommonProductcompareEle.click();
    }
    public Boolean successMsgPC()
    {
    	return SuccessMessageProductcompare.isDisplayed();
    }

}
