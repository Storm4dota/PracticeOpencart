package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsLetterPage extends BasePage {
	
	public NewsLetterPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Newsletter']") WebElement newsletter_btn;
	@FindBy(xpath="//input[@value='0']") WebElement No_enabled;
	@FindBy(xpath="//input[@value='1']") WebElement Yes_enabled;
	public void click_newsletter()
	{
		newsletter_btn.click();
	}
	public boolean SubscribedYes()
	{
		return Yes_enabled.isEnabled();
	}
	
	public boolean SubscribedNo()
	{
		return No_enabled.isEnabled();
	}
	

}
