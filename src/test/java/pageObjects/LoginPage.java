package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver
			)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']") WebElement email_txt_login;
	@FindBy(xpath="//input[@id='input-password']") WebElement pass_txt_login;
	@FindBy(xpath="//input[@value='Login']") WebElement login_btn;
	
	
	public void emailtxtlogin(String email)
	{
		email_txt_login.sendKeys(email);;
	}
	
	public void passtxtlogin(String pass)
	{
		pass_txt_login.sendKeys(pass);
	}
	
	public void clicklogin()
	{
		login_btn.click();
	}

}
