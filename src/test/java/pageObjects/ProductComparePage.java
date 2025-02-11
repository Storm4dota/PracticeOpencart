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
    @FindBy(xpath="//a[normalize-space()='product comparison']") WebElement productcomparsionPage;
    @FindBy(xpath="//i[@class='fa fa-th-list']") WebElement listview_button; //List View
    @FindBy(xpath="//i[@class='fa fa-th']") WebElement Gridview_button; //Grid View
    @FindBy(xpath="//a[@id='compare-total']") WebElement ProductcompareLinkPage; //PC page link
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
    public Boolean successMsgPC_displayed()
    {
    	return SuccessMessageProductcompare.isDisplayed();
    }
    
    public void PCPage_click()
    {
    	productcomparsionPage.click();
    }
    public void ListView_click()
    {
    	listview_button.click();
    }
    
    public void GridView_click()
    {
    	Gridview_button.click();
    }
    
    public void PC_link_Page() 
    {
    	ProductcompareLinkPage.click();
    }

}
